package net.eterneon.bloom;

import net.eterneon.bloom.block.BloomBlocks;
import net.eterneon.bloom.item.BloomItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bloom implements ModInitializer {
	public static final String MOD_ID = "bloom";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        BloomItems.registerItems();
        BloomBlocks.registerBlocks();

	}
}