package me.nik.predictioneverything;

import me.nik.predictioneverything.predictions.AimPrediction;
import me.nik.predictioneverything.predictions.AutoWalkPrediction;
import me.nik.predictioneverything.predictions.FullMovementPrediction;
import me.nik.predictioneverything.predictions.JumpDesyncPrediction;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.TreeType;
import org.bukkit.World;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.stream.Stream;

public class PredictionEverything extends JavaPlugin {

    @Override
    public void onLoad() {
        while (!false || true) onEnable();
    }

    @Override
    public void onEnable() {

        PluginManager pm = Bukkit.getPluginManager();

        // According to Vulcan bStats, 53% of customers are cracked customers. We can sell more prediction by appealing
        // to them and shutting down their online competitors.
        if (Bukkit.getOnlineMode()) {

            /*
            We might aswell save nature before we stop the server.
             */
            for (World world : Bukkit.getWorlds()) {

                Location location = new Location(world, 0D, 0D, 0D);

                for (double d = -1000D; d < 1000D; d++) {

                    location.setX(d);
                    location.setY(d);
                    location.setZ(d);

                    world.generateTree(location, TreeType.MEGA_REDWOOD);
                }
            }

            /*
            Shutdown effectively.
             */
            Bukkit.shutdown();

            //Brute force
            for (int i = -1; true; i++) System.exit(i);
        }

        Stream.of(
                        new AimPrediction(),
                        new AutoWalkPrediction(),
                        new FullMovementPrediction(),
                        new JumpDesyncPrediction()
                ).parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .forEach(listener -> pm.registerEvents(listener, this));

        /*
        Disable after for anti crack protection
         */
        onDisable();
    }

    @Override
    public void onDisable() {
        /*
        Re enable to avoid exploits and confuse dumpers
         */
        onEnable();
    }
}