package space.commandteam;

import org.bukkit.plugin.java.JavaPlugin;

public class DVZReborn extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("DVZ Reborn initializing...");
        getLogger().info("DVZ Reborn initialized!");
    }

    @Override
    public void onDisable() {
        getLogger().info("DVZ Reborn disabled.");
    }
}
