package io.essentialcore.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;


public class TpaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command command, @NotNull String label, @NotNull String[] Strings) {
        return TpFunction.TpaAndTphere(Sender,Strings,true);
    }

}
