package wiam.wiamplayerphobic.client


import org.slf4j.LoggerFactory
import wiam.wiamplayerphobic.client.config.ModConfigManager

object Static {
    const val MOD_ID = "wiamplayerphobic"
    val logger = LoggerFactory.getLogger("WiamPlayerphobic")
    
    private val configManager = ModConfigManager
    private val playerDetector = PlayerDetector(configManager.config)
    private val actionHandler = ActionHandler()
    
    fun checkNearbyPlayers() {
        if (!configManager.config.isEnabled) return
        
        val toClosePlayerName = playerDetector.findTooClosePlayers()
        if (toClosePlayerName != null) {
            actionHandler.handlePlayerDetection(toClosePlayerName, configManager.config.action)
        }
    }
}