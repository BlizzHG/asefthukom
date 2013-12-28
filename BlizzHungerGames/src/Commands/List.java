package Commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.blizzteam.hg.HungerGames;

public class List implements CommandExecutor { 
	
	public HungerGames plugin;
	public static ArrayList<String> players = new ArrayList();
    public List(HungerGames instance) {
    	
            plugin = instance;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if (cmd.getName().equalsIgnoreCase("list"))  {
                    if (!(sender instanceof Player)) {
                            sender.sendMessage(ChatColor.DARK_RED + "Erreur: Le joueur n'est pas reconnue!");
                            return true;
                    }
                    Player player = (Player) sender;
                    String admin = "§4";
                    String technicien = "§c";
                    String moderateur = "§5";
                    String pro = "§6";
                    String mvp = "§1";
                    String vip = "§a";
                    String defaut = "§7";
                    player.sendMessage("§4Groupes§7: §4Admins§2 ,§cTechnicien§2 ,§5Moderateur§2 ,§6Pro§2 ,§1Mvp§2 ,§aVip§2 ,§7Default");
                    
            return true;
    }
			return false;

}
    
}