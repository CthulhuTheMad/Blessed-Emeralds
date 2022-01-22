package net.cthulhuthemad.blessedemeralds;

import net.cthulhuthemad.blessedemeralds.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlessedEmeralds implements ModInitializer {
	public static final String MOD_ID = "blessedemeralds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		LOGGER.info("Now Loading " + BlessedEmeralds.MOD_ID);
	}
}
