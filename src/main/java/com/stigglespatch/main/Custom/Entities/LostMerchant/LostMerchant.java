package com.stigglespatch.main.Custom.Entities.LostMerchant;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Villager;

public class LostMerchant {



    public Villager spawnLostMerchant(Location loc) {
        Villager merchant = loc.getWorld().spawn(loc, Villager.class);
        merchant.setCustomName(ChatColor.AQUA + "Lost Merhcant");
        merchant.setCustomNameVisible(true);
        merchant.setAdult();
        merchant.setInvulnerable(true);
        merchant.setVillagerType(Villager.Type.DESERT);
        merchant.setProfession(Villager.Profession.NITWIT);
        merchant.setVillagerLevel(1);
        merchant.setVillagerExperience(1);
        merchant.setCanPickupItems(false);
        merchant.setCustomNameVisible(true);

        /*
        On spawn, assign the inventory with the custom items.

        USE:
        MERCHANTLISTENER
        INVENTORYMANAGER
         */

        return merchant;
    }

    public void spawnMerchantRep(Location loc) {
        Villager merchant = loc.getWorld().spawn(loc, Villager.class);
        merchant.setCustomName(ChatColor.AQUA + "Merchant Representative");
        merchant.setCustomNameVisible(true);
        merchant.setAdult();
        merchant.setInvulnerable(true);
        merchant.setVillagerType(Villager.Type.DESERT);
        merchant.setProfession(Villager.Profession.NITWIT);
        merchant.setVillagerLevel(1);
        merchant.setVillagerExperience(1);
        merchant.setCanPickupItems(false);
        merchant.setCustomNameVisible(true);
    }

}
