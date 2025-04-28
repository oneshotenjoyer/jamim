package net.modguyo7.jamim;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.modguyo7.jamim.item.ModItems;

public class JAMIM implements ModInitializer {
	public static final String MOD_ID = "just-another-missing-items-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading JAMIM...");

		ModItems.registerModItems();

	}
}