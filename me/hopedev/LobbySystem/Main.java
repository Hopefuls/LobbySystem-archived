wpackage me.hopedev.LobbySystem;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import me.hopedev.LobbySystem.Commands.Hobby;
import me.hopedev.LobbySystem.GUI.GuiListener;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
  public static ByteArrayOutputStream b = new ByteArrayOutputStream();
  
  public static DataOutputStream out = new DataOutputStream(b);
  
  public static File file2 = new File("plugins/HopeLobby", "config.yml");
  
  public static File file3 = new File("plugins/HopeLobby", "messages.yml");
  
  public static File file4 = new File("plugins/HopeLobby", "items.yml");
  
  public static FileConfiguration cfg2 = (FileConfiguration)YamlConfiguration.loadConfiguration(file2);
  
  public static FileConfiguration cfg3 = (FileConfiguration)YamlConfiguration.loadConfiguration(file3);
  
  public static FileConfiguration cfg4 = (FileConfiguration)YamlConfiguration.loadConfiguration(file4);
  
  private static Main instance;
  
  public static File customConfigFile;
  
  public static HashMap<Player, Boolean> build = new HashMap<>();
  
  public static FileConfiguration customConfig;
  
  public static ConsoleCommandSender console = Bukkit.getConsoleSender();
  
  public static String lockprefix = "§e§lH§r§6obby§7»§f ";
  
  public void onEnable() {
    createCustomConfig("messages.yml");
    createCustomConfig("config.yml");
    createCustomConfig("items.yml");
    loadConfig();
    Bukkit.getServer().getPluginManager().registerEvents(new listener(), (Plugin)this);
    Bukkit.getServer().getPluginManager().registerEvents((Listener)new GuiListener(), (Plugin)this);
    getServer().getMessenger().registerOutgoingPluginChannel((Plugin)this, "BungeeCord");
    instance = this;
    getCommand("hobby").setExecutor((CommandExecutor)new Hobby());
    getCommand("menu").setExecutor((CommandExecutor)new Hobby());
    getCommand("build").setExecutor((CommandExecutor)new Hobby());
    console.sendMessage(String.valueOf(lockprefix) + "§e§lHopes §r§6Lobbysystem §awird gestartet!");
    loadConfig();
  }
  
  public void onDisable() {
    console.sendMessage(String.valueOf(lockprefix) + "§e§lHopes §r§6Lobbysystem §awird deaktiviert!");
  }
  
  public static Main inst() {
    return instance;
  }
  
  private void createCustomConfig(String name) {
    customConfigFile = new File(getDataFolder(), name);
    if (!customConfigFile.exists()) {
      customConfigFile.getParentFile().mkdirs();
      saveResource(name, false);
    } 
    customConfig = (FileConfiguration)new YamlConfiguration();
    try {
      customConfig.load(customConfigFile);
    } catch (IOException|org.bukkit.configuration.InvalidConfigurationException e) {
      e.printStackTrace();
    } 
  }
  
  public static void loadConfig() {
    cfg2 = (FileConfiguration)YamlConfiguration.loadConfiguration(file2);
    cfg3 = (FileConfiguration)YamlConfiguration.loadConfiguration(file3);
    cfg4 = (FileConfiguration)YamlConfiguration.loadConfiguration(file4);
  }
  
  public static void send(Player p, String s) {
    try {
      out.writeUTF("Connect");
      out.writeUTF(s);
    } catch (IOException eee) {
      Bukkit.getLogger().info("You'll never see me!");
    } 
    p.sendPluginMessage((Plugin)inst(), "BungeeCord", b.toByteArray());
  }
}
