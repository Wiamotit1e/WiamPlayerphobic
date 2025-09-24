package wiam.wiamplayerphobic.client

import wiam.wiamplayerphobic.client.config.Action

class ActionHandler {
    
    fun handlePlayerDetection(playerName: String, action: Action) {
        when (action) {
            Action.LOGGING_OUT -> ClientUtils.disconnectDueToPlayer(playerName)
            Action.NOTIFICATION -> ClientUtils.playNotificationSound()
        }
    }
}