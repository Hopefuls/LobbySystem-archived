package me.hopedev.LobbySystem.Commands.listed;

import me.hopedev.LobbySystem.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class build {
  public static void build(CommandSender sender, String[] args) {
    if (args.length == 0) {
      Player p = (Player)sender;
      if (Main.build.get(p) == null) {
        Main.build.put(p, Boolean.valueOf(true));
        p.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " " + Main.cfg3.getString("build-on").replace("&", "§"));
      } else if (!((Boolean)Main.build.get(p)).booleanValue()) {
        Main.build.put(p, Boolean.valueOf(true));
        p.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " " + Main.cfg3.getString("build-on").replace("&", "§"));
      } else if (((Boolean)Main.build.get(p)).booleanValue()) {
        Main.build.put(p, Boolean.valueOf(false));
        p.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " " + Main.cfg3.getString("build-off").replace("&", "§"));
      } 
    } 
    if (args.length == 1) {
      if (Bukkit.getPlayer(args[0]) == null) {
        String not = args[0];
        String message = Main.cfg3.getString("build-notonline").replaceAll("%player%", not);
        sender.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " " + message.replace("&", "§"));
      } else if (Bukkit.getPlayer(args[0]) != null) {
        Player target = Bukkit.getPlayer(args[0]);
        if (Main.build.get(target) == null) {
          String targetname = target.getName();
          Main.build.put(target, Boolean.valueOf(true));
          String message = Main.cfg3.getString("build-on-other").replaceAll("%player%", targetname);
          sender.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " " + message.replace("&", "§"));
        } else if (!((Boolean)Main.build.get(target)).booleanValue()) {
          String targetname = target.getName();
          Main.build.put(target, Boolean.valueOf(true));
          String message = Main.cfg3.getString("build-on-other").replaceAll("%player%", targetname);
          sender.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " " + message.replace("&", "§"));
        } else if (((Boolean)Main.build.get(target)).booleanValue()) {
          String targetname = target.getName();
          Main.build.put(target, Boolean.valueOf(false));
          String message = Main.cfg3.getString("build-off-other").replaceAll("%player%", targetname);
          sender.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " " + message.replace("&", "§"));
        } 
      } 
    } else if (args.length >= 1) {
      sender.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " §cBenutzung: §7/build <Spieler>");
    } 
  }
}
