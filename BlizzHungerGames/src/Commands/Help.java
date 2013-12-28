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
                    int j = Bukkit.getOnlinePlayers().length ;
                    String v = ChatColor.DARK_PURPLE + Bukkit.getBukkitVersion();
                    String bvn = ChatColor.DARK_PURPLE + player.getName();
                    player.sendMessage("§4▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    player.sendMessage("§4▬    §dBienvenue§7: " + bvn );
                    player.sendMessage("§4▬ §2Start§7: "); //+ getTimestart);
                    player.sendMessage("§4▬ §2Joueurs§7: " + ChatColor.DARK_PURPLE + j); 
                    player.sendMessage("§4▬ §2Version§7: " + v );
                    player.sendMessage("§4▬ §2Site§7: §5Blizzgames.com ");
                    player.sendMessage("§4▬ §2Commandes§7: §5/kits§2,§5/kit§2,§5/kitinfo ");
                    player.sendMessage("§4▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
            }
           
            return true;
    }

}


