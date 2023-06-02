package io.essentialcore.Command;

import io.essentialcore.EssentialCore;
import io.essentialcore.PlayerTpStruct;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TpFunction implements TabCompleter {
    public static boolean TpaAndTphere(CommandSender Sender, String[] Strings, boolean isTpaAndTphere) {
        // 调用指令的是否是控制台
        if (Sender instanceof Player) {
            // 确认传入的是正确的数组
            if (Strings.length == 0) {
                if (isTpaAndTphere) {
                    Sender.sendMessage(ChatColor.RED + "[" + ChatColor.GOLD + "EssentialCore" + ChatColor.RED + "]" + ChatColor.GOLD + "：/tpa [玩家名]");
                    return false;
                } else {
                    Sender.sendMessage(ChatColor.RED + "[" + ChatColor.GOLD + "EssentialCore" + ChatColor.RED + "]" + ChatColor.GOLD + "：/tphere [玩家名]");
                    return false;
                }
            }
            // 查找这个玩家是否存在，要是不存在就返回false退出函数
            if (!EssentialCore.Date.PlayerFind(Strings[0])) {
                Sender.sendMessage(ChatColor.RED + "[" + ChatColor.GOLD + "EssentialCore" + ChatColor.RED + "]" + ChatColor.GOLD + "这个玩家不在线");
                return false;
            }
            // 获取被传送玩家的Object
            Player player = Bukkit.getPlayer(Strings[0]);
            // 是否获取到对象
            if (player != null) {
                if (isTpaAndTphere) {
                    // 发送请求
                    player.sendMessage(ChatColor.RED + "[" + ChatColor.GOLD + "EssentialCore" + ChatColor.RED + "]" + ChatColor.GOLD + Sender.getName() + " 请求传送到你");
                    player.sendMessage(ChatColor.RED + "[" + ChatColor.GOLD + "EssentialCore" + ChatColor.RED + "]" + ChatColor.GOLD + "：/tpaccept 接受对方发来的传送请求");
                    player.sendMessage(ChatColor.RED + "[" + ChatColor.GOLD + "EssentialCore" + ChatColor.RED + "]" + ChatColor.GOLD + "：/tpdeny 拒绝对方发来的传送请求");
                    EssentialCore.Date.PlayerTpList.add(new PlayerTpStruct(Bukkit.getPlayer(Sender.getName()), player));
                    return true;
                } else {
                    player.sendMessage(ChatColor.RED + "[" + ChatColor.GOLD + "EssentialCore" + ChatColor.RED + "]" + ChatColor.GOLD +"：" + Sender.getName() + " 请求你传送到TA");
                    player.sendMessage(ChatColor.RED + "[" + ChatColor.GOLD + "EssentialCore" + ChatColor.RED + "]" + ChatColor.GOLD + "：/tpaccept 接受对方发来的传送请求");
                    player.sendMessage(ChatColor.RED + "[" + ChatColor.GOLD + "EssentialCore" + ChatColor.RED + "]" + ChatColor.GOLD + "：/tpdeny 拒绝对方发来的传送请求");
                    EssentialCore.Date.PlayerTpList.add(new PlayerTpStruct(player, Bukkit.getPlayer(Sender.getName())));
                    return true;
                }
            }

        } else {
            EssentialCore.input(ChatColor.RED + "不要在控制台调用该命令");
        }
        return false;
    }

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] Strings) {
        return EssentialCore.Date.PlayerList;
    }
}
