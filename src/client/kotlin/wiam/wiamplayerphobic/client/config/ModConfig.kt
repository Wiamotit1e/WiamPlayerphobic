package wiam.wiamplayerphobic.client.config

import me.shedaniel.autoconfig.ConfigData
import wiam.wiamplayerphobic.client.Static
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.EnumHandler
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.EnumHandler.EnumDisplayOption

@Config(name = Static.MOD_ID)
class ModConfig: ConfigData {
    var isEnabled = true
    @EnumHandler(option = EnumDisplayOption.BUTTON)
    var action = Action.LOGGING_OUT
    var distance = 400
    var players: MutableList<String> = mutableListOf<String>()
}