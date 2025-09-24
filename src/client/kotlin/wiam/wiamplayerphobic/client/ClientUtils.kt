package wiam.wiamplayerphobic.client

import net.minecraft.client.MinecraftClient
import net.minecraft.client.sound.PositionedSoundInstance
import net.minecraft.sound.SoundEvents
import net.minecraft.text.Text

object ClientUtils {
    var pitch = 1.0f
    
    val client: MinecraftClient
        get() = MinecraftClient.getInstance()
    
    val clientPlayer
        get() = client.player
    
    val clientWorld
        get() = client.world
    
    fun disconnectDueToPlayer(player: String) {
        client.networkHandler?.connection?.disconnect(Text.translatable("text.wiamplayerphobic.autologgoff", player))
    }
    
    fun playNotificationSound() {
        client.soundManager.play(PositionedSoundInstance.master(SoundEvents.BLOCK_NOTE_BLOCK_HARP.value(), pitch, 1.0f))
        if ( pitch <=4.0f) pitch = 0.1f + pitch
        else pitch = 1.0f
    }
}