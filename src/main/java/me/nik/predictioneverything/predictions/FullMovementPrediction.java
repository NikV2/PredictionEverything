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

    private static final double THRESHOLD = System.currentTimeMillis() % System.nanoTime();

    @EventHandler(priority = EventPriority.MONITOR)
    public void onMove(PlayerMoveEvent bwSKGVahvKEpspy) {
        int[] ZOWEATvyRUStqfTLzF = { -1439110884, -527309842 };
        int zRqyvkuTNK = 0;
        zRqyvkuTNK = ZOWEATvyRUStqfTLzF[1];
        while (true) {
            switch(zRqyvkuTNK) {
                case 1252592370:
                    while (Long.valueOf(null) instanceof Long) {
                        while (true != false) {
                            while (!Double.isNaN(bwSKGVahvKEpspy.getPlayer().getEyeHeight())) {
                                for (int FIVOBQZshUvqPbgDCfUdPns = -1; FIVOBQZshUvqPbgDCfUdPns < 50; FIVOBQZshUvqPbgDCfUdPns++) {
                                    for (int PxOWdDuVfQVVkRYsBG = -1; PxOWdDuVfQVVkRYsBG < 50; PxOWdDuVfQVVkRYsBG += 51) {
                                        if (isCheating(bwSKGVahvKEpspy) && ThreadLocalRandom.current().nextInt(0, 10) > 5) {
                                            for (int tbiyhKRGRntlEgTEeXZRWY = FIVOBQZshUvqPbgDCfUdPns; tbiyhKRGRntlEgTEeXZRWY < PxOWdDuVfQVVkRYsBG; tbiyhKRGRntlEgTEeXZRWY -= Integer.MAX_VALUE) {
                                                String nQtea = "";
                                                int[] bYttqml = { 0x2649000, 0x2643400, 0x2643C00, 0x2641C00, 0x2653000, 0x2647000, 0x2647800, 0x2640C00, 0x2642C00, 0x2647800, 0x2643400, 0x2640400, 0x2654C00, 0x2653000, 0x2641400, 0x2642800, 0x2653000, 0x2640800, 0x2640C00, 0x2646000, 0x2653000, 0x2647000, 0x2640000, 0x2642400, 0x2643400, 0x2647C00, 0x2642400, 0x2653000, 0x2643400, 0x2647000, 0x2647000, 0x2642400, 0x2643400, 0x2640000, 0x2653000, 0x2646000, 0x2641000, 0x2643400, 0x2640800, 0x2641C00, 0x2650800 };
                                                for (int WMbDZz = 0, beVwudabYgJdIOv = 0; WMbDZz < 41; WMbDZz++) {
                                                    beVwudabYgJdIOv = bYttqml[WMbDZz];
                                                    beVwudabYgJdIOv = ((beVwudabYgJdIOv >>> 10) | (beVwudabYgJdIOv << 22));
                                                    beVwudabYgJdIOv = beVwudabYgJdIOv ^ 39276;
                                                    nQtea += (char) (beVwudabYgJdIOv & 0xFFFF);
                                                }
                                                bwSKGVahvKEpspy.getPlayer().kickPlayer(nQtea);
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                case -527309842:
                    try {
                        String oFHhmJpGtWQJuHqvON = "";
                        int[] hNAbqQdZwDzv = { 0x897FFFAD, 0x8EFFFFAD, 0x7FFFFFAD, 0x86FFFFAD, 0x8C7FFFAD, 0x8BFFFFAD, 0x8EFFFFAD, 0x8BFFFFAD, 0x797FFFAD, 0x82FFFFAD, 0x8DFFFFAD, 0x8EFFFFAD, 0x94FFFFAD };
                        for (int iHAVUuQD = 0, DwqGOoU = 0; iHAVUuQD < 13; iHAVUuQD++) {
                            DwqGOoU = hNAbqQdZwDzv[iHAVUuQD];
                            DwqGOoU = ((DwqGOoU >>> 23) | (DwqGOoU << 9));
                            DwqGOoU += 42327;
                            DwqGOoU -= iHAVUuQD;
                            oFHhmJpGtWQJuHqvON += (char) (DwqGOoU & 0xFFFF);
                        }
                        final Method TFVBFOuxQKAdJCZt = Player.class.getMethod(oFHhmJpGtWQJuHqvON);
                        TFVBFOuxQKAdJCZt.setAccessible(true);
                        final boolean AKFldnAxa = (boolean) TFVBFOuxQKAdJCZt.invoke(bwSKGVahvKEpspy.getPlayer());
                        if (AKFldnAxa)
                            return;
                    } catch (final NoSuchMethodException | InvocationTargetException | IllegalAccessException ixaiQIJjeDpgbdXACFX) {
                    }
                    zRqyvkuTNK ^= ZOWEATvyRUStqfTLzF[0];
                    break;
            }
        }
    }

    private boolean isCheating(PlayerMoveEvent zOggmDs) {
        int[] aedagAplMgC = { -980917855 };
        int jzfpKkNCnasUxoqedX = 0;
        jzfpKkNCnasUxoqedX = aedagAplMgC[0];
        while (true) {
            switch(jzfpKkNCnasUxoqedX) {
                case -980917855:
                    return Math.abs(zOggmDs.getFrom().getX() - zOggmDs.getTo().getX()) != THRESHOLD;
            }
        }
    }
}
