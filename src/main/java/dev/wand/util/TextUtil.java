package dev.wand.util;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

@UtilityClass
public class TextUtil {

    public String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public String strip(String text) {
        return ChatColor.stripColor(text);
    }
}
