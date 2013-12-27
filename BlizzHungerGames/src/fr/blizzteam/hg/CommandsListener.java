package fr.blizzteam.hg;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class CommandsListener implements Listener {
	
	HungerGames hgmain;
        
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("help")) {
                sender.sendMessage(ChatColor.GREEN + "command help");
                return true;
        }
        if (cmd.getName().equalsIgnoreCase("who")) {
            sender.sendMessage(ChatColor.GREEN + "command who");
            return true;
        }
        return true;
    }
}