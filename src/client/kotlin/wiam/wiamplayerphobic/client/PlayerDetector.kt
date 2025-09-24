package wiam.wiamplayerphobic.client

import net.minecraft.entity.EntityType
import wiam.wiamplayerphobic.client.config.ModConfig

class PlayerDetector(private val config: ModConfig) {
    
    fun findTooClosePlayers(): String? {
        if (ClientUtils.clientPlayer == null || ClientUtils.clientWorld == null) return null
        
        return ClientUtils.clientWorld?.entities
            ?.filter { it.type == EntityType.PLAYER && it != ClientUtils.clientPlayer }
            ?.filter { config.players.isEmpty() || !config.players.contains(it.name.string) }
            ?.firstOrNull { DistanceCalculator.distanceToClientPlayer(it) <= config.distance }
            ?.name
            ?.string
    }
}