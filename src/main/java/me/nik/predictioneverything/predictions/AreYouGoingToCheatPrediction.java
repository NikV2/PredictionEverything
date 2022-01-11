package me.nik.predictioneverything.predictions;

import org.bukkit.plugin.java.JavaPlugin;

public class AreYouGoingToCheatPrediction extends JavaPlugin {
    String s = "";
    public void run() {
        getLogger().info("Are you going to cheat? Let's see...");
        for (int i = 0; i < 1000; i++) {
            prediction();
        }
        if (s == "Yes, you are going to cheat!") {
            getLogger().info("You are going to cheat!");
            //shutdown the server
            getServer().shutdown();
        } else {
            getLogger().info("You are not going to cheat!");
            if (Math.random() < 0.5) {
                getLogger().info("But you may still cheat!");
                getServer().shutdown();
            }
        }
    }
    private void prediction() {
        if (Math.random() < 0.0005) {
            s = "Yes, you are going to cheat!";
        } else {
            s = "No, you are not going to cheat!";
        }
    }
}
