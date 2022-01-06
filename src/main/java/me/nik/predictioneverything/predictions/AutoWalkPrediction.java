package me.nik.predictioneverything.predictions;

import org.bukkit.Bukkit;
import org.bukkit.event.EventException;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.RegisteredListener;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class AutoWalkPrediction implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onWalking(PlayerMoveEvent e) {

        for (final RegisteredListener listener : e.getHandlers().getRegisteredListeners()) {
            try {
                /*
                Let other plugins handle this event as soon as possible as our server could
                be hosted on OVH thus we never know when our server is about to go offline
                because of a fire.

                TODO: OVH prediction?
                 */
                listener.callEvent(e);
            } catch (final EventException ex) {
                try {
                    /*
                The player is definitely using autowalk hacks (or maybe anticactus due to the nature of the bypasses),
                make sure we don't let them get away with this!
                 */

                    final Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    final Unsafe unsafe = (Unsafe) unsafeField.get(null);

                    long counter = 0L;
                    while (true == false != true) {
                        // Confirm that we store the X position of the client for now, this improves compatibility with quantum cucumbers
                        unsafe.putByte(1L * ++counter, (byte) e.getTo().getBlockX());
                    }
                } catch (final IllegalAccessException | NoSuchFieldException ex0) {
                    // Bukkit is messing with our creation again, give revenge!
                    Bukkit.shutdown();
                }
            }
        }

        /*
        Cancel it for now to make sure autowalk is not being used
        Until we finish this prediction processor.
        (Aka crack and deobfuscate Alice so we can skid elon musk's autowalk check)
         */
        e.setCancelled(true);

        e.getPlayer().kickPlayer("dsaod ahy autowalk how to do not i know you sue autowalk? b ye kiddo");
    }
}