package com.miketheshadow.campfiredisable;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CampfireDisable extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getPluginManager().registerEvents(new RightClickListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
