package me.hopedev.LobbySystem.Commands;

import java.io.IOException;
import me.hopedev.LobbySystem.Commands.listed.build;
import me.hopedev.LobbySystem.Commands.listed.main;
import me.hopedev.LobbySystem.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Hobby implements CommandExecutor {
  private Main plugin;
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (cmd.getName().equalsIgnoreCase("Hobby")) {
      try {
        main.ex(sender, args);
      } catch (IOException e) {
        e.printStackTrace();
      } 
      return true;
    } 
    if (cmd.getName().equalsIgnoreCase("menu")) {
      main.gui(sender, args);
      return true;
    } 
    if (cmd.getName().equalsIgnoreCase("build")) {
      if (sender.hasPermission("hobby.build")) {
        build.build(sender, args);
        return true;
      } 
      if (!sender.hasPermission("hobby.build")) {
        sender.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " " + Main.cfg3.getString("build-nopermission").replace("&", "§"));
        return true;
      } 
    } 
    return false;
  }
}
