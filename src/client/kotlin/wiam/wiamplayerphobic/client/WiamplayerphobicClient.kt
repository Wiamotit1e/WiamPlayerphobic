package wiam.wiamplayerphobic.client

import com.mojang.brigadier.CommandDispatcher
import com.mojang.brigadier.arguments.BoolArgumentType
import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
import net.minecraft.text.Text
import wiam.wiamplayerphobic.client.config.ModConfig
import wiam.wiamplayerphobic.client.config.ModConfigManager

class WiamplayerphobicClient : ClientModInitializer {
    
    override fun onInitializeClient() {
        AutoConfig.register(ModConfig::class.java) { definition, configClass -> GsonConfigSerializer(definition, configClass) }
        
        // 注册命令
        ClientCommandRegistrationCallback.EVENT.register { dispatcher, _ ->
            ModCommands.registerCommands(dispatcher)
        }
        
        Static.logger.info("WiamplayerphobicClient initialized")
    }
}

object ModCommands {
    
    fun registerCommands(dispatcher: CommandDispatcher<FabricClientCommandSource>) {
        dispatcher.register(
            ClientCommandManager.literal("playerphobic")
                .then(
                    ClientCommandManager.literal("toggle")
                        .executes { context ->
                            toggleMod(!ModConfigManager.config.isEnabled)
                            context.source.sendFeedback(Text.of("Playerphobic mod ${if (ModConfigManager.config.isEnabled) "enabled" else "disabled"}"))
                            1
                        }
                )
                .then(
                    ClientCommandManager.literal("enable")
                        .executes { context ->
                            toggleMod(true)
                            context.source.sendFeedback(Text.of("Playerphobic mod enabled"))
                            1
                        }
                )
                .then(
                    ClientCommandManager.literal("disable")
                        .executes { context ->
                            toggleMod(false)
                            context.source.sendFeedback(Text.of("Playerphobic mod disabled"))
                            1
                        }
                )
                .then(
                    ClientCommandManager.literal("status")
                        .executes { context ->
                            val status = if (ModConfigManager.config.isEnabled) "enabled" else "disabled"
                            val action = ModConfigManager.config.action.name
                            val distance = ModConfigManager.config.distance
                            context.source.sendFeedback(Text.of("Playerphobic mod is $status | Action: $action | Distance: $distance blocks"))
                            1
                        }
                )
                .then(
                    ClientCommandManager.literal("set")
                        .then(
                            ClientCommandManager.argument("enabled", BoolArgumentType.bool())
                                .executes { context ->
                                    val enabled = BoolArgumentType.getBool(context, "enabled")
                                    toggleMod(enabled)
                                    context.source.sendFeedback(Text.of("Playerphobic mod ${if (enabled) "enabled" else "disabled"}"))
                                    1
                                }
                        )
                )
        )
    }
    
    private fun toggleMod(enabled: Boolean) {
        ModConfigManager.config.isEnabled = enabled
        ModConfigManager.save()
        Static.logger.info("Playerphobic mod ${if (enabled) "enabled" else "disabled"}")
    }
}