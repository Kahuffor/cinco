package com.stigglespatch.main.Dungeon;

import com.stigglespatch.main.Dungeon.Cuboids.Cuboid;
import com.stigglespatch.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class TestDungeon extends Dungeon {

    String name;
    World world;
    public TestDungeon(Main main, int dungeonID) {
        super(main, dungeonID, new Location (Bukkit.getWorld ("testdungeon"), 43.5, -42, 190.5));
        name = "testdungeon";
        world = Bukkit.getWorld(name);
        addRooms();
    }

    public void addRooms () {
        //Need to add trigger cuboids

        rooms.add (new LobbyRoom (new Cuboid(new Location(world, 41, -46, 195), new Location(world,24, -36, 185))));
        rooms.add (new MobRoom (new Cuboid(new Location(world,23, -47, 195), new Location(world,-5, -36, 182))));
        //rooms.add (new FillerRoom (new Cuboid(new Location(world,11, -36, 182), new Location(world,-5, -46, 199))));
        rooms.add (new TargetRoom (new Cuboid(new Location(world,24,-31,181), new Location(world,-4,-55,149))));
        rooms.add (new FillerRoom (new Cuboid(new Location(world,-3,-39,125), new Location(world,11,-60,149))));
        rooms.add (new WaveRoom (new Cuboid(new Location(world,11,-48,124), new Location(world,-16,-59,111))));
        rooms.add (new MobRoom (new Cuboid(new Location(world,12,-48,110), new Location(world,28,-59,127))));
        rooms.add (new MobRoom (new Cuboid(new Location(world,27,-48,93), new Location(world,10,-59,110))));
        rooms.add (new BossRoom (new Cuboid(new Location(world,28,-59,93), new Location(world,62,-40,109)),
                                 new Cuboid(new Location(world,41, -57, 98), new Location(world, 47, -56, 104)))); //Boss spawn trigger
        rooms.add (new FinalRoom (new Cuboid(new Location(world,63,-54,107), new Location(world,107,-41,96)),
                                  new Cuboid(new Location(world,93, -48, 99), new Location(world, 98, -44, 103)))); //TP Trigger
        /*
        rooms.add (new LobbyRoom (new Cuboid(new Location(world, 41, -46, 195), new Location(world,28, -36, 185)),  //Boundary
                                  new Cuboid(new Location(world, 24, -44, 192), new Location(world, 24, 38, 188)), //Entrance
                                  new Location(world, 43.5, -42, 190.5) //Spawnpoint
        ));

        rooms.add (new MobRoom (new Cuboid(new Location(world,12, -35, 195), new Location(world,25, -45, 184)), //Boundary
                                new Cuboid(new Location(world,12, -35, 195), new Location(world,25, -45, 184)), //Trigger
                                new Cuboid(new Location(world,12, -35, 195), new Location(world,25, -45, 184)), //Entrance
                                new Cuboid(new Location(world,12, -35, 195), new Location(world,25, -45, 184)), //Exit

                new Location(world, 9.5, -44, 190.5)));

        rooms.add (new FillerRoom (new Cuboid(new Location(world,11, -36, 182), new Location(world,-5, -45, 199)),
                new Location(world, 0.5, -44, 184.5)));

        rooms.add (new TargetRoom (new Cuboid(new Location(world,24,-31,181), new Location(world,-4,-53,149)),
                new Location(world, 4.5, -44, 179.5)));

        rooms.add (new FillerRoom (new Cuboid(new Location(world,-3,-39,125), new Location(world,11,-59,149)),
                new Location(world, 4.5, -57, 135.5)));

        rooms.add (new WaveRoom (new Cuboid(new Location(world,11,-48,124), new Location(world,-16,-58,111)),
                new Location(world, 4.5, -57, 122.5)));

        rooms.add (new MobRoom (new Cuboid(new Location(world,12,-49,110), new Location(world,28,-58,127)),
                new Location(world, 12.5, -57, 118.5)));

        rooms.add (new MobRoom (new Cuboid(new Location(world,27,-49,93), new Location(world,10,-58,110)),
                new Location(world, 19.5, -57, 107.5)));

        rooms.add (new MobRoom (new Cuboid(new Location(world,62,-23,115), new Location(world,28,-59,88)),
                new Location(world, 30.5, -57, 101.5)));

        rooms.add (new MobRoom (new Cuboid(new Location(world,63,-54,107), new Location(world,109,-27,96)),
                new Location(world, 65.5, -53, 101.5)));
*/
        /*
        Cuboid finalRoom = new Cuboid(
                new Location(Bukkit.getWorld("testdungeon"),63,-54,107),
                new Location(Bukkit.getWorld("testdungeon"),109,-27,96));
        Cuboid finalRoomTriggerWall = new Cuboid(
                new Location(Bukkit.getWorld("testdungeon"),32,-50,94),
                new Location(Bukkit.getWorld("testdungeon"),35,-57,108));
        Cuboid finalRoomWall = new Cuboid(
                new Location(Bukkit.getWorld("testdungeon"),28,-57,99),
                new Location(Bukkit.getWorld("testdungeon"),28,-54,103));
        Cuboid finalRoomTP = new Cuboid(
                new Location(Bukkit.getWorld("testdungeon"),109,-49,97),
                new Location(Bukkit.getWorld("testdungeon"),90,-41,105));
        Cuboid tutorialDungeon = new Cuboid(
                new Location(Bukkit.getWorld("testdungeon"),111, -64, 81),
                new Location(Bukkit.getWorld("testdungeon"),-20, -14, 211));

         */


    }
}
