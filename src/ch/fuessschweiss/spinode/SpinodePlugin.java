package ch.fuessschweiss.spinode;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpinodePlugin extends JavaPlugin {
	private FileConfiguration pluginConfiguration = getConfig();
	
	// fired when plugin gets enabled
	@Override
	public void onEnable() {
		// add sayHello to configuration
		pluginConfiguration.addDefault("sayHello", true);
		
		// copy the configuration
		pluginConfiguration.options().copyDefaults(true);
		saveConfig();
		
		getServer().getPluginManager().registerEvents(new SpinodeListener(), this);
	}
	
	// fired when plugin gets disabled
	@Override
	public void onDisable() {
		
	}
}
