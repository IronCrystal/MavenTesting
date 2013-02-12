package me.IronCrystal.MavenTesting;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class MavenTesting extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " is now disabled!");
	}
	
	@Override
	public void onEnable() {
		
		//Enabling Message
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " has been enabled.");
	}
}
