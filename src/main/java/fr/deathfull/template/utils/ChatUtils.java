package fr.deathfull.template.utils;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.universe.Universe;

public class ChatUtils {

    public static void broadcastMessage(String message) {
        Universe.get().getWorlds().values().forEach((world) -> world.getPlayerRefs().forEach((player) -> player.sendMessage(Message.raw(message))));
    }
}
