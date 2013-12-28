package Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.blizzteam.hg.HungerGames;

public class List implements CommandExecutor { 
	
	public HungerGames plugin;
	 
    public List(HungerGames instance) {
    	
            plugin = instance;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if (cmd.getName().equalsIgnoreCase("list") || cmd.getName().equalsIgnoreCase("who"))  {
                    if (!(sender instanceof Player)) {
                            sender.sendMessage(ChatColor.DARK_RED + "Erreur: Le joueur n'est pas reconnue!");
                            return true;
                    }
                    Player player = (Player) sender;
                    player.sendMessage("§4Groupes§7: §4Admins§2 ,§cTechnicien ,§5Moderateur ,§6Pro ,§1Mvp ,§aVip ,§7Default");
            return true;
    }
			return false;

}
    
}