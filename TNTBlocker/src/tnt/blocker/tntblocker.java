package tnt.blocker;

//import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import net.md_5.bungee.api.ChatColor;

public class tntblocker implements Listener {

	@EventHandler
	public void onPlace(BlockPlaceEvent event) {
		
		Player player = event.getPlayer();
		Block block = event.getBlock();
		
		if(block.getType().equals(Material.TNT)) {
			
			block.setType(Material.AIR);
			//Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "title @p title {\"text\":\"TNT OFF\",\"bold\":true,\"color\":\"red\"}");
			player.sendMessage(ChatColor.RED + "TNT is not enabled on this server!");
			
		}
	}
	
}

