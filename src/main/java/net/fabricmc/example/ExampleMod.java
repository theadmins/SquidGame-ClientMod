package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.PlayerModelPart;
import net.minecraft.sound.SoundCategory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("squidgamemod");

	private MinecraftClient client;

	@Override
	public void onInitialize() {
		/*MinecraftClient client = MinecraftClient.getInstance();

		client.options.gamma = 1.0f;
		client.options.setSoundVolume(SoundCategory.MUSIC, 0);
		client.options.setPlayerModelPart(PlayerModelPart.CAPE, false);
		client.inGameHud.vignetteDarkness = 0.0f;*/

	}
}
