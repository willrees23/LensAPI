package dev.wand.util;

import lombok.experimental.UtilityClass;
import org.bukkit.command.CommandSender;

@UtilityClass
public class ChatUtil {

    public void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(TextUtil.color(message));
    }

    public void sendRawMessage(CommandSender sender, String message) {
        sender.sendMessage(message);
    }
}
