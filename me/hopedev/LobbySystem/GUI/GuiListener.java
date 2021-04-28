package me.hopedev.LobbySystem.GUI;

import me.hopedev.LobbySystem.BungeeCord.Sendto;
import me.hopedev.LobbySystem.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiListener implements Listener {
  @EventHandler
  private void inventoryClick(InventoryClickEvent e) {
    Player p = (Player)e.getWhoClicked();
    if (e.getInventory().getTitle().equalsIgnoreCase(Main.cfg2.getString("menu-name").replace("&", "§"))) {
      e.setCancelled(true);
      if (e.getCurrentItem() == null || e.getCurrentItem().getType().equals(Material.AIR))
        return; 
      if (e.getSlot() == 11)
        Sendto.send(p, Main.cfg2.getString("servers.1").replace("&", "§")); 
      if (e.getSlot() == 15)
        Sendto.send(p, Main.cfg2.getString("servers.2").replace("&", "§")); 
      if (e.getSlot() == 19)
        Sendto.send(p, Main.cfg2.getString("servers.3").replace("&", "§")); 
      if (e.getSlot() == 22) {
        String worldname = Main.cfg2.getString("spawn.world");
        World world = Bukkit.getServer().getWorld(worldname);
        double x = Main.cfg2.getDouble("spawn.x");
        double y = Main.cfg2.getDouble("spawn.y");
        double z = Main.cfg2.getDouble("spawn.z");
        Location loc = new Location(world, x, y, z);
        p.teleport(loc);
        p.sendMessage(String.valueOf(Main.cfg2.getString("prefix").replace("&", "§")) + " " + Main.cfg3.getString("spawn-message").replace("&", "§"));
      } 
      if (e.getSlot() == 25)
        Sendto.send(p, Main.cfg2.getString("servers.5").replace("&", "§")); 
      if (e.getSlot() == 29)
        Sendto.send(p, Main.cfg2.getString("servers.6").replace("&", "§")); 
      if (e.getSlot() == 33)
        Sendto.send(p, Main.cfg2.getString("servers.7").replace("&", "§")); 
    } 
  }
}
