package dev.wand.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public interface LensCommand extends TabExecutor {

    boolean execute(CommandSender sender, String[] args);
    List<String> complete(CommandSender sender, String[] args);

    @Override
    default boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return execute(sender, args);
    }

    @Override
    default List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return complete(commandSender, strings);
    }

    default Player castSender(CommandSender sender) {
        if (sender instanceof Player) {
            return (Player) sender;
        }
        return null;
    }
}
