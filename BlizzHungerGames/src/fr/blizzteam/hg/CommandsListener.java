package fr.blizzteam.hg;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

public class CommandsListener implements Listener	 {
	
	HungerGames hgmain;
        
    public boolean onCommand(CommandSender s, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("help") || cmd.getName().equalsIgnoreCase("aide")) {
        	    s.sendMessage(ChatColor.GOLD + "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                s.sendMessage(ChatColor.GOLD + "▒▒▒▒▒▒▒▒▒     §dBienvenue          ▒▒▒▒▒▒▒▒▒");
                s.sendMessage(ChatColor.GOLD + "▒▒▒▒▒▒▒▒▒ §aJoueurs: "  + s.getServer().getOnlinePlayers().length);
                s.sendMessage(ChatColor.GOLD + "▒▒▒▒▒▒▒▒▒ §eStart:                 ▒▒▒▒▒▒▒▒▒");
                s.sendMessage(ChatColor.GOLD + "▒▒▒▒▒▒▒▒▒ §7Site:    www.mcpvp.com ▒▒▒▒▒▒▒▒▒");
                s.sendMessage(ChatColor.GOLD + "▒▒▒▒▒▒▒▒▒ §7Version: 1.6.4         ▒▒▒▒▒▒▒▒▒");
                s.sendMessage(ChatColor.GOLD + "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                return true;
        }
        if (cmd.getName().equalsIgnoreCase("list")) {
            s.sendMessage("§2Groupes: §4Adminstrateur ,§cTechnicien ,§5Moderateur ,§6Pro ,§1Mvp ,§aVip ,§7defaut");
            s.sendMessage("§2Joueurs en ligne:" + s.getServer().getOnlinePlayers().length); 
    
        }
        return true;
    }

	}
