package tnt.main;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;
import tnt.blocker.tntblocker;

public class Main extends JavaPlugin {

	public void onEnable() {
		
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nTNTBlocker Plugin Has Been Enabled!\n\n");
		getServer().getPluginManager().registerEvents(new tntblocker (), this);
	}
	
	public void onDisable() {
		
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nTNTBlocker Plugin Has Been Disabled!\n\n");
		
	}
	
}
