package fr.deathfull.template.events;

import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.player.AddPlayerToWorldEvent;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import fr.deathfull.template.utils.ChatUtils;

public class EventListener {

    public void onPlayerReady(PlayerReadyEvent event) {
        Player player = event.getPlayer();
        ChatUtils.broadcastMessage("Player " + player.getDisplayName() + " has joined the game!");
    }

    public void onAddPlayerToWorld(AddPlayerToWorldEvent event) {
        event.setBroadcastJoinMessage(false);
    }
}
