package me.hopedev.LobbySystem.Commands.listed;

import java.io.IOException;
import me.hopedev.LobbySystem.Main;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChangeSettings {
  public static void change(CommandSender sender, String[] args) {
    Player p = (Player)sender;
    if (args.length == 1) {
      p.sendMessage(String.valueOf(Main.lockprefix) + "§cBenutzung: §7/hobby set item/name/spawn 1/2/3/4/5/6/7 <name>");
    } else if (args[1].equalsIgnoreCase("item")) {
      if (args.length == 2) {
        p.sendMessage(String.valueOf(Main.lockprefix) + "§cBenutzung: §7/hobby set item 1/2/3/4/5/6/7");
      } else if (args[2].equalsIgnoreCase("1")) {
        if (p.getItemInHand().getType() == Material.AIR) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst für diesen Befehl ein Item in der Hand haben");
        } else if (p.getItemInHand().getType() != Material.AIR) {
          String item = p.getItemInHand().getType().toString();
          Main.cfg4.set("1.item", item);
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aItem für §e1 §awurde erfolgreich geändert zu §e" + item);
        } 
      } else if (args[2].equalsIgnoreCase("2")) {
        if (p.getItemInHand().getType() == Material.AIR) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst für diesen Befehl ein Item in der Hand haben");
        } else if (p.getItemInHand().getType() != Material.AIR) {
          String item = p.getItemInHand().getType().toString();
          Main.cfg4.set("2.item", item);
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aItem für §e2 §awurde erfolgreich geändert zu §e" + item);
        } 
      } else if (args[2].equalsIgnoreCase("3")) {
        if (p.getItemInHand().getType() == Material.AIR) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst für diesen Befehl ein Item in der Hand haben");
        } else if (p.getItemInHand().getType() != Material.AIR) {
          String item = p.getItemInHand().getType().toString();
          Main.cfg4.set("3.item", item);
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aItem für §e3 §awurde erfolgreich geändert zu §e" + item);
        } 
      } else if (args[2].equalsIgnoreCase("4")) {
        if (p.getItemInHand().getType() == Material.AIR) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst für diesen Befehl ein Item in der Hand haben");
        } else if (p.getItemInHand().getType() != Material.AIR) {
          String item = p.getItemInHand().getType().toString();
          Main.cfg4.set("4.item", item);
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aItem für §e4 §awurde erfolgreich geändert zu §e" + item);
        } 
      } else if (args[2].equalsIgnoreCase("5")) {
        if (p.getItemInHand().getType() == Material.AIR) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst für diesen Befehl ein Item in der Hand haben");
        } else if (p.getItemInHand().getType() != Material.AIR) {
          String item = p.getItemInHand().getType().toString();
          Main.cfg4.set("5.item", item);
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aItem für §e5 §awurde erfolgreich geändert zu §e" + item);
        } 
      } else if (args[2].equalsIgnoreCase("6")) {
        if (p.getItemInHand().getType() == Material.AIR) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst für diesen Befehl ein Item in der Hand haben");
        } else if (p.getItemInHand().getType() != Material.AIR) {
          String item = p.getItemInHand().getType().toString();
          Main.cfg4.set("6.item", item);
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aItem für §e6 §awurde erfolgreich geändert zu §e" + item);
        } 
      } else if (args[2].equalsIgnoreCase("7")) {
        if (p.getItemInHand().getType() == Material.AIR) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst für diesen Befehl ein Item in der Hand haben");
        } else if (p.getItemInHand().getType() != Material.AIR) {
          String item = p.getItemInHand().getType().toString();
          Main.cfg4.set("7.item", item);
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aItem für §e7 §awurde erfolgreich geändert zu §e" + item);
        } 
      } else {
        p.sendMessage("§cBenutzung: §7/hobby set item 1/2/3/4/5/6/7");
      } 
    } else if (args[1].equalsIgnoreCase("name")) {
      if (args.length == 2) {
        p.sendMessage(String.valueOf(Main.lockprefix) + "§cBenutzung: §7/hobby set name 1/2/3/4/5/6/7 <Name>");
        p.sendMessage(String.valueOf(Main.lockprefix) + "§eEs werden Colorcodes mit & unterstützt!");
      } else if (args[2].equalsIgnoreCase("1")) {
        if (args[3] == null) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst einen Namen angeben");
        } else if (args[3] != null) {
          StringBuilder sb = new StringBuilder();
          for (int i = 2; i < args.length; i++) {
            if (i > 0)
              sb.append(" "); 
            sb.append(args[i]);
          } 
          Main.cfg4.set("1.displayname", sb.toString().substring(3).replace("&", "§"));
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aAnzeigename von §e1 §ades Items §e" + Main.cfg4.getString("1.item") + "§a wurde zu \"" + sb.toString().substring(3).replace("&", "§") + "§a\"§a geändert!");
        } 
      } else if (args[2].equalsIgnoreCase("2")) {
        if (args[3] == null) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst einen Namen angeben");
        } else if (args[3] != null) {
          StringBuilder sb = new StringBuilder();
          for (int i = 2; i < args.length; i++) {
            if (i > 0)
              sb.append(" "); 
            sb.append(args[i]);
          } 
          Main.cfg4.set("2.displayname", sb.toString().substring(3).replace("&", "§"));
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aAnzeigename von §e2 §ades Items §e" + Main.cfg4.getString("2.item") + "§a wurde zu \"" + sb.toString().substring(3).replace("&", "§") + "§a\"§a geändert!");
        } 
      } else if (args[2].equalsIgnoreCase("3")) {
        if (args[3] == null) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst einen Namen angeben");
        } else if (args[3] != null) {
          StringBuilder sb = new StringBuilder();
          for (int i = 2; i < args.length; i++) {
            if (i > 0)
              sb.append(" "); 
            sb.append(args[i]);
          } 
          Main.cfg4.set("3.displayname", sb.toString().substring(3).replace("&", "§"));
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aAnzeigename von §e3 §ades Items §e" + Main.cfg4.getString("3.item") + "§a wurde zu \"" + sb.toString().substring(3).replace("&", "§") + "§a\"§a geändert!");
        } 
      } else if (args[2].equalsIgnoreCase("4")) {
        if (args[3] == null) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst einen Namen angeben");
        } else if (args[3] != null) {
          StringBuilder sb = new StringBuilder();
          for (int i = 2; i < args.length; i++) {
            if (i > 0)
              sb.append(" "); 
            sb.append(args[i]);
          } 
          Main.cfg4.set("4.displayname", sb.toString().substring(3).replace("&", "§"));
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aAnzeigename von §e4 §ades Items §e" + Main.cfg4.getString("4.item") + "§a wurde zu \"" + sb.toString().substring(3).replace("&", "§") + "§a\"§a geändert!");
        } 
      } else if (args[2].equalsIgnoreCase("5")) {
        if (args[3] == null) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst einen Namen angeben");
        } else if (args[3] != null) {
          StringBuilder sb = new StringBuilder();
          for (int i = 2; i < args.length; i++) {
            if (i > 0)
              sb.append(" "); 
            sb.append(args[i]);
          } 
          Main.cfg4.set("5.displayname", sb.toString().substring(3).replace("&", "§"));
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aAnzeigename von §e5 §ades Items §e" + Main.cfg4.getString("5.item") + "§a wurde zu \"" + sb.toString().substring(3).replace("&", "§") + "§a\"§a geändert!");
        } 
      } else if (args[2].equalsIgnoreCase("6")) {
        if (args[3] == null) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst einen Namen angeben");
        } else if (args[3] != null) {
          StringBuilder sb = new StringBuilder();
          for (int i = 2; i < args.length; i++) {
            if (i > 0)
              sb.append(" "); 
            sb.append(args[i]);
          } 
          Main.cfg4.set("6.displayname", sb.toString().substring(3).replace("&", "§"));
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aAnzeigename von §e6 §ades Items §e" + Main.cfg4.getString("6.item") + "§a wurde zu \"" + sb.toString().substring(1).replace("&", "§") + "§a\"§a geändert!");
        } 
      } else if (args[2].equalsIgnoreCase("7")) {
        if (args[3] == null) {
          p.sendMessage(String.valueOf(Main.lockprefix) + "§cDu musst einen Namen angeben");
        } else if (args[3] != null) {
          StringBuilder sb = new StringBuilder();
          for (int i = 2; i < args.length; i++) {
            if (i > 0)
              sb.append(" "); 
            sb.append(args[i]);
          } 
          Main.cfg4.set("7.displayname", sb.toString().substring(3).replace("&", "§"));
          try {
            Main.cfg4.save(Main.file4);
          } catch (IOException e) {
            e.printStackTrace();
          } 
          p.sendMessage(String.valueOf(Main.lockprefix) + "§aAnzeigename von §e7 §ades Items §e" + Main.cfg4.getString("7.item") + "§a wurde zu \"" + sb.toString().substring(3).replace("&", "§") + "§a\"§a geändert!");
        } 
      } 
    } else if (args[1].equalsIgnoreCase("spawn")) {
      String world = p.getWorld().getName();
      Location loc = p.getLocation();
      double x = loc.getBlockX();
      double y = loc.getBlockY();
      double z = loc.getBlockZ();
      Main.cfg2.set("spawn.world", world);
      Main.cfg2.set("spawn.x", Double.valueOf(x));
      Main.cfg2.set("spawn.y", Double.valueOf(y));
      Main.cfg2.set("spawn.z", Double.valueOf(z));
      try {
        Main.cfg2.save(Main.file2);
      } catch (IOException e) {
        e.printStackTrace();
      } 
      p.sendMessage(String.valueOf(Main.lockprefix) + "§a Der Spawn wurde erfolgreich zu §e" + x + " " + y + " " + z + " §agesetzt");
    } else {
      p.sendMessage(String.valueOf(Main.lockprefix) + "§cBenutzung: §7/hobby set item/name/spawn 1/2/3/4/5/6/7 <name>");
    } 
  }
}
