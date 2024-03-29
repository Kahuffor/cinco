package com.stigglespatch.main.Dungeon;

import com.stigglespatch.main.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class DungeonManager {

    private static Main main;

    private static HashMap<String, Dungeon> dungeons;
    private static String[] dungeonNames = {"testdungeon"};

    public DungeonManager (Main main) {
        this.main = main;
        dungeons = new HashMap<>();
    }
    public static void forceStart (String dungeon) {
        Dungeon d = dungeons.get (dungeon);
        if (d == null)
            return;

        d.start();
    }
    public static boolean addPlayer (Player player, String dungeonName) {
        if (dungeonName == null) {
            player.sendMessage(ChatColor.RED + "Error: The dungeon name was null. Please contact an administrator.");
            return false;
        }

        if (isValidDungeon(dungeonName)) {
            Dungeon currentDungeon;
            if (!dungeons.containsKey(dungeonName)) { //We must create the dungeon.
                makeNewDungeon(dungeonName);
            }

            currentDungeon = dungeons.get (dungeonName);

            if (currentDungeon.isActive()) {
                player.sendMessage(ChatColor.RED + "Error: That dungeon is in progress! Please try again later.");
                return false;
            }
            if (currentDungeon.isFull()) {
                player.sendMessage(ChatColor.RED + "Error: That dungeon is already full! Please try again later.");
                return false;
            }

            currentDungeon.join(player);
            player.sendMessage(ChatColor.GREEN + "Successfully added you to the dungeon!");
        }
        else {
            player.sendMessage(ChatColor.RED + "Error: The dungeon you specified does not exist!");
            return false;
        }
        return true;
    }
    public static ArrayList<Player> getAlivePlayers (String dungeon) {
        Dungeon d = dungeons.get (dungeon);
        if (d == null)
            return new ArrayList<>();

        return d.getAlivePlayers();
    }
    public static ArrayList<Player> getPlayers (String dungeon) {
        Dungeon d = dungeons.get (dungeon);
        if (d == null)
            return new ArrayList<Player>();

        return d.getPlayers();
    }
    public static boolean isValidDungeon (String dungeonName) {
        if (dungeonName == null)
            return false;

        for (String s : dungeonNames) {
            if (s.equals(dungeonName)) {
                return true;
            }
        }
        return false;
    }
    public static void removeDungeon (String dungeonName) {
        if (dungeonName == null)
            return;

        dungeons.remove (dungeonName);
    }

    public static void makeNewDungeon (String name) {
        if (name.equals ("testdungeon")) {
            int i = dungeons.size();
            dungeons.put ("testdungeon", new TestDungeon (main, i));
        }
        //return null;
    }
}
