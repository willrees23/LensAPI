package dev.wand;

import dev.wand.util.TextUtil;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class SpigotPlugin extends JavaPlugin {

    protected void log(String message) {
        getServer().getConsoleSender().sendMessage(TextUtil.color(message));
    }
}
