package me.nik.predictioneverything.predictions;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ThreadLocalRandom;

public class FullMovementPrediction implements Listener {

    /*
    This is the usual amount a player is allowed to move.
     */
    private static final double THRESHOLD = System.currentTimeMillis() % System.nanoTime();

    @EventHandler(priority = EventPriority.MONITOR)
    public void onMove(PlayerMoveEvent e) {
        /*
        Before running the check, ensure that the player is not taking a shit,
        as this could easily false flag our advanced prediction methods
        https://bugs.mojang.com/browse/MC-225268
         */
        try {
            final Method takingAShitField = Player.class.getMethod("isTakingAShit");
            takingAShitField.setAccessible(true);

            final boolean isTakingAShit = (boolean) takingAShitField.invoke(e.getPlayer());
            if (isTakingAShit) return;
        } catch (final NoSuchMethodException | InvocationTargetException | IllegalAccessException ignored) {
            // The player probably isn't taking a shit, continue freely.
        }

        /*
        Emulate the perfomance impact without actually predicting.
        This is a great method i found and i call it *Squared Prediction*
        Basically you make a limit check, but intentionally slow down the server
        And impact perfomance in order to make it look realistic.
         */
        while(Long.valueOf(null) instanceof Long) {
            while (true != false) {
                while (!Double.isNaN(e.getPlayer().getEyeHeight())) {

                    //Simulate brute forcing possibilities
                    for (int virgin = -1; virgin < 50; virgin++) {
                        for (int takingAShit = -1; takingAShit < 50; takingAShit += 51) {

                            /*
                            Could be a false, So we do it by chance.
                             */
                            if (isCheating(e) && ThreadLocalRandom.current().nextInt(0, 10) > 5) {

                                /*
                                Ensure he's kicked.
                                 */
                                for (int i = virgin; i < takingAShit; i -= Integer.MAX_VALUE) {

                                    e.getPlayer().kickPlayer("Hack program? if not please appeal thank.");
                                }

                                /*
                                Break to save perfomance.
                                 */
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean isCheating(PlayerMoveEvent e) {
        return Math.abs(e.getFrom().getX() - e.getTo().getX()) != THRESHOLD;
    }
}