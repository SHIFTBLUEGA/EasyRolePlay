package ml;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class rpopmcrp implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 1 && args[0].equals("about")){
            sender.sendMessage(ChatColor.RED + "MinecraftRolePlay");
            sender.sendMessage(ChatColor.BLUE + "版本:V1.0");
            sender.sendMessage(ChatColor.BLUE + "作者:低调不失很低调");
            sender.sendMessage(ChatColor.BLUE + "简介:暂无");
        }
        if (args.length == 1 && args[0].equals("help")){
            sender.sendMessage(ChatColor.RED + "MinecraftRolePlayOP-HELP");
            sender.sendMessage(ChatColor.RED + "以下功能均未实现,仅供参考,未来版本不一定有");
            sender.sendMessage("opmcrp group create - 创建组织");
            sender.sendMessage("opmcrp group delete - 删除组织");
            sender.sendMessage("opmcrp group join (group) (player) - 加入组织");
            sender.sendMessage("opmcrp group quit (player) - 退出组织");
        }

        return false;
    }
}
