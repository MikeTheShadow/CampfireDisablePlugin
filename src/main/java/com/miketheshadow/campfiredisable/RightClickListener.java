package com.miketheshadow.campfiredisable;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class RightClickListener implements Listener {

    @EventHandler
    public void onRightClickEvent(PlayerInteractEvent event) {
        Block block = event.getClickedBlock();
        if(block == null || event.getClickedBlock().getType() != Material.CAMPFIRE || event.getAction() != Action.RIGHT_CLICK_BLOCK) return;
        event.getPlayer().sendMessage(ChatColor.RED + "Campfires are disabled!");
        event.setCancelled(true);
    }

}
