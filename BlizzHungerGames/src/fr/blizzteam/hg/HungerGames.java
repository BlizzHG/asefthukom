package fr.blizzteam.hg;
 
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import Commands.Help;
 
public class HungerGames extends JavaPlugin implements Listener {
	
    public Date launchTime;
    
    
    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();
        getCommand("help").setExecutor(new Help(this));
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        launchTime = DateUtils.addHours(new Date(), 1);
    
    }
    
    public void onStart() {
    	Bukkit.getServer().getMotd();
    }
    
    
}