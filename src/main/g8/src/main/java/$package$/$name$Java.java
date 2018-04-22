package $package$;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class $name$Java extends JavaPlugin implements Listener {
    private static $name$Java instance;

    public $name$Java() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("You cannot create another instance of the main class");
        }
    }

    public static $name$Java get() {
        return instance;
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);

        $name$.onEnable();
    }

    @Override
    public void onDisable() {
        $name$.onDisable();
    }

    // Event Handlers
    //
    // Every method below needs to be annotated with @EventHandler and call $name$.onJoin(event).
    // We need this to be in Java because Spigot uses Java's reflection to call events, and Scala
    // would require a different approach to reflection, which Spigot doesn't support

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        $name$.onJoin(event);
    }
}
