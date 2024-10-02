package ml;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class rpshout implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player){
            if (args.length == 0) {
                sender.sendMessage(ChatColor.RED + "内容不能为空");
            }
                String message = String.join(" ", args[0]);
                Player player = (Player) sender;
                String name = player.getName();
                for (Player onlineplayer : Bukkit.getOnlinePlayers()) {
                    onlineplayer.sendMessage(name + " 大喊:" + message);
                }
                Bukkit.getConsoleSender().sendMessage(name + " 大喊:" + message);

        }
        else {
            sender.sendMessage(ChatColor.RED + "警告:控制台禁止输入!");
        }

        return false;
    }
}
