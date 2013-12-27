package fr.blizzteam.hg.managers;
 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
 

import org.apache.commons.lang.time.DateUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.blizzteam.hg.HungerGames;
 
public class HungerGamesManager extends JavaPlugin implements Listener {
	HungerGames hgmain;
 
    @EventHandler
    public void onServerListPing(ServerListPingEvent event) {
        Date currentTime = new Date();
        DateFormat formatter = SimpleDateFormat.getTimeInstance();
        formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date launchTime = hgmain.launchTime;
        // See if the game has event started
        if (launchTime == null) {
            event.setMotd("Une erreur est survenue.");
        } else {
            // Note: Doesn't take into account leap seconds, ect. 
            long milliDelta = launchTime.getTime() - currentTime.getTime();
            Date dateDelta = new Date(Math.abs(milliDelta));
 
            if (milliDelta > 0) {
                event.setMotd("Le jeux commence dans " + formatter.format(dateDelta));
            } else {
                // You can also print the duration of the game
                //event.setMotd("Game has been running for " + formatter.format(dateDelta));
                event.setMotd("Le jeux est en cour.");
            }
        }
    }
}