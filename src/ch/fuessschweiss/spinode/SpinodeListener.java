package ch.fuessschweiss.spinode;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SpinodeListener implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		//if(pluginConfiguration.getBoolean("sayHello")) {
			player.sendMessage("Trolololol " + player.getDisplayName());
		//}
	}
}
