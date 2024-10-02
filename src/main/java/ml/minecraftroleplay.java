package ml;

import org.bukkit.plugin.java.JavaPlugin;

public final class minecraftroleplay extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("MinecraftRolePlayPlugin1.0 - 已成功启动");

        this.getCommand("mcrp").setExecutor(new rpmcrp());
        this.getCommand("opmcrp").setExecutor(new rpopmcrp());
        this.getCommand("me").setExecutor(new rpme());
        this.getCommand("do").setExecutor(new rpdo());
        this.getCommand("shout").setExecutor(new rpshout());
        this.getCommand("low").setExecutor(new rplow());
        this.getCommand("ooc").setExecutor(new rpooc());
        this.getCommand("radio").setExecutor(new rpradio());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("MinecraftRolePlayPlugin1.0 - 已成功卸载");



    }
}
