package io.essentialcore.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TpacceptCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command command, @NotNull String label, @NotNull String[] Strings) {
        if(Sender instanceof Player) {

        }
        return false;
    }
}
