package Listeners;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import fr.blizzteam.hg.HungerGames;

public class CommandsListener implements Listener {
	public String[] aliases = new String[] { "" };
	
	HungerGames hgmain;
       
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player p = (Player) sender ;
		if (cmd.getName().equalsIgnoreCase("test")) {
			p.sendMessage("§4Ceci est un test");
			
		}
		return true ;
	}
}


	
       
        	
        
    
