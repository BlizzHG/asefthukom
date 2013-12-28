package Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.blizzteam.hg.HungerGames;

public class Help implements CommandExecutor { 
	
	public HungerGames plugin;
	 
    public Help(HungerGames instance) {
    	
            plugin = instance;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if (cmd.getName().equalsIgnoreCase("help")) {
                    if (!(sender instanceof Player)) {
                            sender.sendMessage(ChatColor.DARK_RED + "Erreur: Le joueur n'est pas reconnue!");
                            return true;
                    }
                    Player player = (Player) sender;
                    String v = ChatColor.DARK_PURPLE + Bukkit.getBukkitVersion();
                    String bvn = ChatColor.DARK_PURPLE + player.getName();
                    player.sendMessage("§4▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    player.sendMessage("§4▬    §dBienvenue§7: " + bvn + "      §4▬");
                    player.sendMessage("§4▬§2Version§7: " + v + "               §4▬");
                    player.sendMessage("§4▬§2Site§7: §5Blizzgames.com           §4▬");
                    player.sendMessage("§4▬§2Commands§7: §5/kits,/kit,/kitinfo   §4▬");
                    player.sendMessage("§4▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
            }
           
            return true;
    }

}


