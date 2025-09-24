package wiam.wiamplayerphobic.client.config

import me.shedaniel.autoconfig.AutoConfig

object ModConfigManager {
    val config: ModConfig
        get() = AutoConfig.getConfigHolder(ModConfig::class.java).get()
    fun save() = AutoConfig.getConfigHolder(ModConfig::class.java).save()
}