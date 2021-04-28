package me.hopedev.LobbySystem.Config;

import me.hopedev.LobbySystem.Main;
import org.bukkit.command.CommandSender;

public class reload {
  public static void reloadConfig(CommandSender sender) {
    sender.sendMessage(String.valueOf(Main.lockprefix) + "§eKonfiguration wird neugeladen...");
    Main.loadConfig();
    sender.sendMessage(String.valueOf(Main.lockprefix) + "§eKonfiguration wurde neugeladen!");
  }
}
