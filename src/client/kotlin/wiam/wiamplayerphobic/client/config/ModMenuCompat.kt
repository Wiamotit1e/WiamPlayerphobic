package wiam.wiamplayerphobic.client.config

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import me.shedaniel.autoconfig.AutoConfig
import net.minecraft.client.gui.screen.Screen

class ModMenuCompat : ModMenuApi {
    override fun getModConfigScreenFactory(): ConfigScreenFactory<Screen> {
        return ConfigScreenFactory { parent: Screen? ->
            AutoConfig.getConfigScreen(ModConfig::class.java, parent).get()
        }
    }
}