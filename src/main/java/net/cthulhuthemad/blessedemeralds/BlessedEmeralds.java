package net.cthulhuthemad.blessedemeralds;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlessedEmeralds implements ModInitializer {
	public static final String MOD_ID = "blessedemeralds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Now Loading " + BlessedEmeralds.MOD_ID);
	}
}
