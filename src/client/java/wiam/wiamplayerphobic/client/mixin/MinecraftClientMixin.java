package wiam.wiamplayerphobic.client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.world.EntityList;
import org.jetbrains.annotations.Nullable;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import wiam.wiamplayerphobic.client.Static;

import java.util.concurrent.atomic.AtomicReference;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {

    @Shadow
    @Nullable
    public ClientWorld world;

    @Inject(at = @At("TAIL"), method = "tick")
    public void tick(CallbackInfo callbackInfo) {
        Static.INSTANCE.checkNearbyPlayers();
    }
}