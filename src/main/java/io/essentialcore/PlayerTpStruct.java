package io.essentialcore;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PlayerTpStruct {
    // 被传送的玩家
    Player TeleportingPlayer;
    // 传送到这个玩家
    Player TeleportedPlayer;
    // 是否传送
    boolean needTeleportation;

    public void Tp() throws InterruptedException {
        for (int i = 5;i!=0;i--) {
            TeleportingPlayer.sendMessage(ChatColor.GOLD+"还有 "+i+" 秒后传送");
            if (!needTeleportation) {
                TeleportingPlayer.sendMessage();
                return;
            }
            Thread.sleep(1000);
        }
        Location TeleportingLocation = TeleportingPlayer.getLocation();
        TeleportingLocation.setX(TeleportedPlayer.getLocation().getX());
        TeleportingLocation.setY(TeleportedPlayer.getLocation().getY());
        TeleportingLocation.setZ(TeleportedPlayer.getLocation().getX());
        TeleportingPlayer.teleport(TeleportingLocation);
    }
    /*
    如果是 Tpa 那么那个需要同意或者拒绝传送的人是
     */
    public PlayerTpStruct(Player teleportingPlayer, Player teleportedPlayer) {
        TeleportingPlayer = teleportingPlayer;
        TeleportedPlayer = teleportedPlayer;
        needTeleportation = true;
    }
}
