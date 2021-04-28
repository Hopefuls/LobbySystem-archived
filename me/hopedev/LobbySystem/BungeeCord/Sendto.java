package me.hopedev.LobbySystem.BungeeCord;

import java.io.IOException;
import me.hopedev.LobbySystem.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Sendto {
  public static void send(Player p, String s) {
    try {
      Main.out.writeUTF("Connect");
      Main.out.writeUTF(s);
    } catch (IOException eee) {
      Bukkit.getLogger().info("You'll never see me!");
    } 
    String message = Main.cfg3.getString("serverswitch").replaceAll("%server%", s);
    p.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " " + message.replace("&", "§"));
    p.sendPluginMessage((Plugin)Main.inst(), "BungeeCord", Main.b.toByteArray());
  }
}
