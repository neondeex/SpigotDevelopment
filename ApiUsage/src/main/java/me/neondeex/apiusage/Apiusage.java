package me.neondeex.apiusage;

import me.neondeex.apiusage.listeners.ChatListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Apiusage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ChatListener(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
