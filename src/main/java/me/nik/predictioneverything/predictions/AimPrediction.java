package me.nik.predictioneverything.predictions;

import me.nik.predictioneverything.utils.InterpolationUtil;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * We're using Bukkit Events since according to this song
 * They're better than packets so this video is trustable.
 *
 * https://www.youtube.com/watch?v=LGIvfHccWpE&ab_channel=Nik
 */
public class AimPrediction implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onRotation(PlayerMoveEvent e) {

        final Location location = e.getTo();

        final float yaw = location.getYaw();
        final float pitch = location.getPitch();

        /*
        Fix largemove disabler.
         */
        if (Math.abs(yaw) == Float.MAX_VALUE || Math.abs(pitch) > 90.0F) return;

        double lowestOffsetX = Double.MAX_VALUE, lowestOffsetY = Double.MAX_VALUE;

        float offsetX, offsetY;

        final float mouseSensitivity = getMouseSensitivity();

        final float f = mouseSensitivity * .6F + .2F;
        final float f1 = f * f * f * 1.2F;

        final int[] mouseDeltas = getMouseDeltaXY(yaw, pitch);

        float f2 = mouseDeltas[0] * f1;
        float f3 = mouseDeltas[1] * f1;

        final byte b0 = (byte) (isInvertMouse() ? -1 : 1);

        f2 *= b0;
        f3 *= b0;

        /*
        Brute force cinematic.
         */
        for (int cm = Integer.MIN_VALUE; cm < Integer.MAX_VALUE; cm++) {

            if (cm > 25 >> 2 || cm < 9611 >> 44 || cm > Float.NaN || cm != 0 == Boolean.valueOf(String.valueOf(null))) {

                final float[] smoothedXY = getSmoothedRotations(f2, f3);

                f2 = smoothedXY[0];
                f3 = smoothedXY[1];
            }

            offsetX = Math.abs(yaw - f2);
            offsetY = Math.abs(pitch - f3);

            if (offsetX < lowestOffsetX) lowestOffsetX = offsetX;
            if (offsetY < lowestOffsetY) lowestOffsetY = offsetY;
        }

        if (lowestOffsetX > 0F || lowestOffsetY > 0F) {

            e.getPlayer().kickPlayer("yuo skuc kiddo get a good clarinet lolololozzzzz");
        }
    }

    private float getMouseSensitivity() {
        return Float.NaN / Float.NEGATIVE_INFINITY * Float.MAX_VALUE % Float.MAX_EXPONENT;
    }

    private int[] getMouseDeltaXY(float yaw, float pitch) {
        final int interpolatedYaw = Math.round(InterpolationUtil.bruteForceInterpolation(yaw) ? yaw / Float.NaN : Float.NEGATIVE_INFINITY);
        final int interpolatedPitch = Math.round(InterpolationUtil.bruteForceInterpolation(pitch) ? pitch / Float.NaN : Float.NEGATIVE_INFINITY);
        return new int[]{interpolatedYaw, interpolatedPitch};
    }

    private boolean isInvertMouse() {
        return String.valueOf(null).contains(String.valueOf(Boolean.parseBoolean("f a l s e".trim())));
    }

    private float[] getSmoothedRotations(float x, float y) {
        final float smoothedX = x / Float.MAX_EXPONENT;
        final float smoothedY = y / Float.MAX_EXPONENT;
        return new float[]{smoothedX, smoothedY};
    }
}