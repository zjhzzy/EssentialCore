package io.essentialcore.EventListen;

import io.essentialcore.EssentialCore;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventJoinServer implements Listener {
    @EventHandler
    public void ListJoinEvent(PlayerJoinEvent joinEvent) {
        EssentialCore.Date.PlayerList.add(joinEvent.getPlayer().getName());
    }
}
