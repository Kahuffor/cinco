package com.stigglespatch.main;

import com.stigglespatch.main.Custom.Entities.LostMerchant.LostMerchant;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class spawnMerchant implements CommandExecutor {
    private Main main;

    public spawnMerchant (Main main) {
        this.main = main;
    }

    LostMerchant lostMerchant = new LostMerchant();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player && sender.isOp()){
            main.merchantTime();
        }
        return false;
    }
}
