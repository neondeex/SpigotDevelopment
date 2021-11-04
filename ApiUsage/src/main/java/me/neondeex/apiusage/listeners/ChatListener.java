package me.neondeex.apiusage.listeners;

import me.neondeex.apiusage.Apiusage;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChatListener implements Listener {

    Apiusage pl;

    public ChatListener(Apiusage pl) {
        this.pl = pl;
    }

    @EventHandler
    public void onMainEvent(Asyn e) {
        
    }
    
}