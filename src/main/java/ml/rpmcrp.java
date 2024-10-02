package ml;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class rpmcrp implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 1 && args[0].equals("help")){
            sender.sendMessage(ChatColor.RED + "MinecraftRolePlayPlugin1.0 - Help");
            sender.sendMessage(ChatColor.RED + "由于技术原因,暂时无法制作附近消息,只能全服消息");
            sender.sendMessage(ChatColor.GREEN + "mcrp help - 帮助中心");
            sender.sendMessage(ChatColor.GREEN + "me - 第一人称描述");
            sender.sendMessage(ChatColor.GREEN + "do - 第三人称描述");
            sender.sendMessage(ChatColor.GREEN + "shout - 喊话");
            sender.sendMessage(ChatColor.GREEN + "low - 小声说话");
            sender.sendMessage(ChatColor.GREEN + "radio - 无线电");
            sender.sendMessage(ChatColor.GREEN + "ooc - 发送ooc消息");
        }
        else {
            sender.sendMessage(ChatColor.RED + "MinecraftRolePlayPlugin");
            sender.sendMessage("版本:1.0");
            sender.sendMessage("作者:低调不是很低调");
            sender.sendMessage("作者BILIBILI:https://space.bilibili.com/593929739");
            sender.sendMessage("在Github上为我点Star:https://github.com/SHIFTBLUEGA/MinecraftRolePlay");
            sender.sendMessage("在爱发电上为我发电:http://afdian.com/a/didiao404");

        }





        return false;
    }
}
