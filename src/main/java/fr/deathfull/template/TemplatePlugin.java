package fr.deathfull.template;

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import fr.deathfull.template.commands.Ping;
import fr.deathfull.template.events.EventListener;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class TemplatePlugin extends JavaPlugin {

    public TemplatePlugin(@NonNullDecl JavaPluginInit init) {
        super(init);
        getLogger().atInfo().log("Plugin is loading...");
    }

    @Override
    protected void setup() {
        this.getCommandRegistry().registerCommand(new Ping());
        this.getEventRegistry().registerGlobal(PlayerReadyEvent.class, new EventListener()::onPlayerReady);
        getLogger().atInfo().log("Plugin setup complete!");
    }

    @Override
    protected void start() {
        getLogger().atInfo().log("Plugin enabled!");
    }

    @Override
    protected void shutdown() {
        getLogger().atInfo().log("Plugin disabled!");
    }

}
