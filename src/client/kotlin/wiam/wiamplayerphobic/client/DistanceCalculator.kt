package wiam.wiamplayerphobic.client

import net.minecraft.entity.Entity

object DistanceCalculator {
    fun distanceToClientPlayer(entity: Entity) = entity.distanceTo(ClientUtils.clientPlayer)
}