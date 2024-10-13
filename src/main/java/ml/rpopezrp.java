package ml;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class rpopezrp implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (args.length == 1 && args[0].equals("help")){
            sender.sendMessage(ChatColor.RED + "EasyRolePlayOP-HELP");
            sender.sendMessage(ChatColor.RED + "以下功能均未实现,仅供参考,未来版本不一定有");
            sender.sendMessage("opezrp group create - 创建组织");
            sender.sendMessage("opezrp group delete - 删除组织");
            sender.sendMessage("opezrp group join (group) (player) - 加入组织");
            sender.sendMessage("opezrp group quit (player) - 退出组织");
        }

        return false;
    }
}
