package io.essentialcore;

import io.essentialcore.Command.TpFunction;
import io.essentialcore.Command.TpaCommand;
import io.essentialcore.Command.TphereCommand;
import io.essentialcore.EventListen.EventJoinServer;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class EssentialCore extends JavaPlugin {

    public static PluginData Date = new PluginData();
    // TODO: 你现在写到了关于传送的销毁，在玩家传送后、拒绝传送后、无反应后销毁对应的实例
    @Override
    public void onEnable() {
        // Plugin startup logic
        input(ChatColor.GREEN+"EssentialCore插件已启动");
        PluginCommand Tpa = getCommand("tpa");
        Tpa.setExecutor(new TpaCommand());
        Tpa.setTabCompleter(new TpFunction());
        Tpa.setDescription("这是EssentialCore插件提供的传送指令");

        PluginCommand Tphere = getCommand("tphere");
        Tphere.setExecutor(new TphereCommand());
        Tphere.setTabCompleter(new TpFunction());
        Tphere.setDescription("这是EssentialCore插件提供的一个传送指令");

        PluginCommand Tpaccept = getCommand("tpaccept");
        Tpaccept.setLabel("还没实现");
        Tpaccept.setDescription("这是EssentialCore插件提供的一个关于传送的指令");

        Bukkit.getPluginManager().registerEvents(new EventJoinServer(), this);
        input(ChatColor.AQUA+"已经注册所有事件");
        Bukkit.getServer().getConsoleSender().sendMessage("[EssentialCore] "+ChatColor.GREEN +" _______  _______  _______  _______  __    _  _______  ___   _______  ___     ");
        Bukkit.getServer().getConsoleSender().sendMessage("[EssentialCore] "+ChatColor.GREEN +"|       ||       ||       ||       ||  |  | ||       ||   | |   _   ||   |    ");
        Bukkit.getServer().getConsoleSender().sendMessage("[EssentialCore] "+ChatColor.GREEN +"|    ___||  _____||  _____||    ___||   |_| ||_     _||   | |  |_|  ||   |    ");
        Bukkit.getServer().getConsoleSender().sendMessage("[EssentialCore] "+ChatColor.GREEN +"|   |___ | |_____ | |_____ |   |___ |       |  |   |  |   | |       ||   |    ");
        Bukkit.getServer().getConsoleSender().sendMessage("[EssentialCore] "+ChatColor.GREEN +"|    ___||_____  ||_____  ||    ___||  _    |  |   |  |   | |       ||   |___ ");
        Bukkit.getServer().getConsoleSender().sendMessage("[EssentialCore] "+ChatColor.GREEN +"|   |___  _____| | _____| ||   |___ | | |   |  |   |  |   | |   _   ||       |");
        Bukkit.getServer().getConsoleSender().sendMessage("[EssentialCore] "+ChatColor.GREEN +"|_______||_______||_______||_______||_|  |__|  |___|  |___| |__| |__||_______|");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static void input(String msg) {
        Bukkit.getServer().getConsoleSender().sendMessage("[EssentialCore] "+msg);
    }
    // TODO: 你写到固定配色了，记得不要搞错了啊！！！
    public static void Send(Player player,String msg) {
        player.sendMessage(ChatColor.GOLD+"");
    }
}
