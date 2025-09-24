package wiam.wiamplayerphobic.client.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import wiam.wiamplayerphobic.client.Static;


@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {

    @Inject(at = @At("TAIL"), method = "tick")
    public void tick(CallbackInfo callbackInfo) {
        Static.INSTANCE.checkNearbyPlayers();
    }
}