package me.nik.predictioneverything.predictions;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class AutoWalkPrediction implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onWalking(PlayerMoveEvent e) {

        /*
        Cancel it for now to make sure autowalk is not being used
        Until we finish this prediction processor.
        (Aka crack and deobfuscate Alice so we can skid elon musk's autowalk check)
         */
        e.setCancelled(true);

        e.getPlayer().kickPlayer("dsaod ahy autowalk how to do not i know you sue autowalk? b ye kiddo");
    }
}