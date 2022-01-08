package me.nik.predictioneverything.predictions;

import me.nik.predictioneverything.utils.InterpolationUtil;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class AimPrediction implements Listener {

    private float getMouseSensitivity() {
        int[] eTSEBnUXuGsmW = { 109858038 };
        int zYQAsWQjaalwqHU = 0;
        zYQAsWQjaalwqHU = eTSEBnUXuGsmW[0];
        while (true) {
            switch(zYQAsWQjaalwqHU) {
                case 109858038:
                    return Float.NaN / Float.NEGATIVE_INFINITY * Float.MAX_VALUE % Float.MAX_EXPONENT;
            }
        }
    }

    private int[] getMouseDeltaXY(float ulBnbfDmoAGyV, float aGhwWNvwPkyC) {
        int[] PeqxtsQVyLwkFVENZsxfK = { 1052554346, -345267459, -1320658022 };
        int JqAleqRagxPHZPQqx = 0;
        int KlSQfKxHBqJI = 0;
        int GFRHqdNElA = 0;
        GFRHqdNElA = PeqxtsQVyLwkFVENZsxfK[2];
        while (true) {
            switch(GFRHqdNElA) {
                case 1512307047:
                    JqAleqRagxPHZPQqx = Math.round(InterpolationUtil.bruteForceInterpolation(aGhwWNvwPkyC) ? aGhwWNvwPkyC / Float.NaN : Float.NEGATIVE_INFINITY);
                    GFRHqdNElA ^= PeqxtsQVyLwkFVENZsxfK[0];
                    break;
                case 1688161549:
                    return new int[] { KlSQfKxHBqJI, JqAleqRagxPHZPQqx };
                case -1320658022:
                    KlSQfKxHBqJI = Math.round(InterpolationUtil.bruteForceInterpolation(ulBnbfDmoAGyV) ? ulBnbfDmoAGyV / Float.NaN : Float.NEGATIVE_INFINITY);
                    GFRHqdNElA ^= PeqxtsQVyLwkFVENZsxfK[1];
                    break;
            }
        }
    }

    private float[] getSmoothedRotations(float TxUWwurEaujUjsfmLYeLbft, float zEhIBn) {
        int[] RrmnqBYgwsGdsNuuQORLZ = { -422960216, 1759564633, -49854698 };
        float mOsnWnpcRBbPU = 0.0f;
        int mfpEdps = 0;
        float DQdHcF = 0.0f;
        mfpEdps = RrmnqBYgwsGdsNuuQORLZ[0];
        while (true) {
            switch(mfpEdps) {
                case -422960216:
                    mOsnWnpcRBbPU = TxUWwurEaujUjsfmLYeLbft / Float.MAX_EXPONENT;
                    mfpEdps ^= RrmnqBYgwsGdsNuuQORLZ[1];
                    break;
                case 1932376039:
                    return new float[] { mOsnWnpcRBbPU, DQdHcF };
                case -1909788431:
                    DQdHcF = zEhIBn / Float.MAX_EXPONENT;
                    mfpEdps ^= RrmnqBYgwsGdsNuuQORLZ[2];
                    break;
            }
        }
    }

    private boolean isInvertMouse() {
        int[] SIMueHEIAkfntXnLQsDPVV = { 2048940559 };
        int nDQjwnAnL = 0;
        nDQjwnAnL = SIMueHEIAkfntXnLQsDPVV[0];
        while (true) {
            switch(nDQjwnAnL) {
                case 2048940559:
                    String jijzWTbomAgHmekZ = "";
                    int[] MbrPfZLCogTXGbxumClbI = { 0x23A6, 0xE00023AE, 0x400023A6, 0x600023A6, 0x800023A6, 0xA00023A6, 0xE00023AE, 0xE00023A6, 0x23A7, 0x200023A7, 0x400023A7, 0x600023A7, 0x23AD, 0xA00023A7, 0x200023B2, 0xE00023A7, 0x23A4, 0xC00023AC, 0x400023A4, 0x600023A4, 0x800023A4, 0xA00023A4, 0xC00023A4, 0xE00023A4, 0x23A5, 0x200023A5, 0x400023A5, 0x600023A5, 0x800023A5, 0xA00023A5, 0xC00023A5, 0xE00023A5, 0x23AA, 0x200023AA, 0x400023AA, 0x600023AA, 0x800023AA, 0xA00023AA, 0xC00023AA };
                    for (int cBErQpnkarpvqAMQqlBpyE = 0, qOCvxIuJTJt = 0; cBErQpnkarpvqAMQqlBpyE < 39; cBErQpnkarpvqAMQqlBpyE++) {
                        qOCvxIuJTJt = MbrPfZLCogTXGbxumClbI[cBErQpnkarpvqAMQqlBpyE];
                        qOCvxIuJTJt = 9122 ^ qOCvxIuJTJt;
                        qOCvxIuJTJt = ((qOCvxIuJTJt << 3) | (qOCvxIuJTJt >>> 29));
                        qOCvxIuJTJt -= cBErQpnkarpvqAMQqlBpyE;
                        jijzWTbomAgHmekZ += (char) (qOCvxIuJTJt & 0xFFFF);
                    }
                    return String.valueOf(null).contains(String.valueOf(Boolean.parseBoolean(jijzWTbomAgHmekZ.trim())));
            }
        }
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onRotation(PlayerMoveEvent cFuLfVQxiPKJgBLQjtFx) {
        int[] hvgOcSeaiUnOGktXLWRKkh = { -1718660544, 286116934, -462351298, 471529165, -7994527, -1777972421, 821238886, -1064562513, -1612024831, -1723452563, 1079381749, 1034371297, -774133873, -503866425, -44964184, 885815679, -913884325 };
        double DYNRJXqOeXY = 0.0;
        float wzbCTpFuR = 0.0f;
        double mlnLXHbaMCUVKiUagpzs = 0.0;
        float iSBopULjKttrmQnABrxC = 0.0f;
        float wiyQHNqluVqMyxDdbpaIeUa = 0.0f;
        float liQpeVfWAjUkgnZGpRA = 0.0f;
        float NCOFORbOIuuDVL = 0.0f;
        int[] mVkfDbahSGhDieVQ = null;
        float ORNvBNpMecYZP = 0.0f;
        float rRkqZMaNMPSQjYbTxMDsB = 0.0f;
        byte MkedFdavehvywucout = 0;
        Location OCDNfsJs = null;
        float AzjpMgpkjyVVaa = 0.0f;
        int uJGExdna = 0;
        float YfJTCwDXOqvwgTwqMUVYZ = 0.0f;
        uJGExdna = hvgOcSeaiUnOGktXLWRKkh[12];
        while (true) {
            switch(uJGExdna) {
                case 1218079793:
                    wzbCTpFuR *= MkedFdavehvywucout;
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[13];
                    break;
                case 1776412505:
                    for (int UNhhqeJVbII = Integer.MIN_VALUE; UNhhqeJVbII < Integer.MAX_VALUE; UNhhqeJVbII++) {
                        if (UNhhqeJVbII > 25 >> 2 || UNhhqeJVbII < 9611 >> 44 || UNhhqeJVbII > Float.NaN || UNhhqeJVbII != 0 == Boolean.valueOf(String.valueOf(null))) {
                            final float[] pWrppb = getSmoothedRotations(wzbCTpFuR, YfJTCwDXOqvwgTwqMUVYZ);
                            wzbCTpFuR = pWrppb[0];
                            YfJTCwDXOqvwgTwqMUVYZ = pWrppb[1];
                        }
                        iSBopULjKttrmQnABrxC = Math.abs(rRkqZMaNMPSQjYbTxMDsB - wzbCTpFuR);
                        AzjpMgpkjyVVaa = Math.abs(NCOFORbOIuuDVL - YfJTCwDXOqvwgTwqMUVYZ);
                        if (iSBopULjKttrmQnABrxC < DYNRJXqOeXY)
                            DYNRJXqOeXY = iSBopULjKttrmQnABrxC;
                        if (AzjpMgpkjyVVaa < mlnLXHbaMCUVKiUagpzs)
                            mlnLXHbaMCUVKiUagpzs = AzjpMgpkjyVVaa;
                    }
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[8];
                    break;
                case -1452410890:
                    YfJTCwDXOqvwgTwqMUVYZ *= MkedFdavehvywucout;
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[7];
                    break;
                case -1349119229:
                    if (Math.abs(rRkqZMaNMPSQjYbTxMDsB) == Float.MAX_VALUE || Math.abs(NCOFORbOIuuDVL) > 90.0F || Math.abs(rRkqZMaNMPSQjYbTxMDsB) >= (NCOFORbOIuuDVL - 0.5F + NCOFORbOIuuDVL / 0.5 - 0.1 + (float) Math.pow(2.0D, Float.MAX_EXPONENT + 1.0D)))
                        return;
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[11];
                    break;
                case -627921460:
                    wzbCTpFuR = mVkfDbahSGhDieVQ[0] * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA;
                    uJGExdna -= hvgOcSeaiUnOGktXLWRKkh[10];
                    break;
                case -1901747762:
                    ORNvBNpMecYZP = getMouseSensitivity();
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[6];
                    break;
                case -1101611608:
                    wiyQHNqluVqMyxDdbpaIeUa = (ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F * ORNvBNpMecYZP * .6F + .2F) / 0;
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[16];
                    break;
                case 919609454:
                    NCOFORbOIuuDVL = OCDNfsJs.getPitch();
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[9];
                    break;
                case -167013544:
                    if (DYNRJXqOeXY > 0F || mlnLXHbaMCUVKiUagpzs > 0F) {
                        String wKGGcuTPQefzhbnVsy = "";
                        int[] VHvvhgbXfxiLQFoVzb = { 0x06E7, 0x06EB, 0x06F1, 0x06BE, 0x06ED, 0x06F5, 0x06EB, 0x06FD, 0x06BE, 0x06F5, 0x06F7, 0x06FA, 0x06FA, 0x06F1, 0x06BE, 0x06F9, 0x06FB, 0x06EA, 0x06BE, 0x06FF, 0x06BE, 0x06F9, 0x06F1, 0x06F1, 0x06FA, 0x06BE, 0x06FD, 0x06F2, 0x06FF, 0x06EC, 0x06F7, 0x06F0, 0x06FB, 0x06EA, 0x06BE, 0x06F2, 0x06F1, 0x06F2, 0x06F1, 0x06F2, 0x06F1, 0x06F2, 0x06F1, 0x06E4, 0x06E4, 0x06E4, 0x06E4, 0x06E4 };
                        for (int vuTYyglYfOit = 0, yakRWiEF = 0; vuTYyglYfOit < 48; vuTYyglYfOit++) {
                            yakRWiEF = VHvvhgbXfxiLQFoVzb[vuTYyglYfOit];
                            yakRWiEF ^= 63697;
                            yakRWiEF = 65103 ^ yakRWiEF;
                            wKGGcuTPQefzhbnVsy += (char) (yakRWiEF & 0xFFFF);
                        }
                        cFuLfVQxiPKJgBLQjtFx.getPlayer().kickPlayer(wKGGcuTPQefzhbnVsy);
                    }
                    return;
                case -774133873:
                    OCDNfsJs = cFuLfVQxiPKJgBLQjtFx.getTo();
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[5];
                    break;
                case -1707303209:
                    YfJTCwDXOqvwgTwqMUVYZ = mVkfDbahSGhDieVQ[1] * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA * liQpeVfWAjUkgnZGpRA;
                    uJGExdna -= hvgOcSeaiUnOGktXLWRKkh[2];
                    break;
                case 2010220275:
                    liQpeVfWAjUkgnZGpRA = wiyQHNqluVqMyxDdbpaIeUa * wiyQHNqluVqMyxDdbpaIeUa * wiyQHNqluVqMyxDdbpaIeUa * 1.2F;
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[0];
                    break;
                case -1244951911:
                    MkedFdavehvywucout = (byte) (isInvertMouse() ? -1 : 1);
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[14];
                    break;
                case 1205726388:
                    rRkqZMaNMPSQjYbTxMDsB = OCDNfsJs.getYaw();
                    uJGExdna -= hvgOcSeaiUnOGktXLWRKkh[1];
                    break;
                case -1842261022:
                    DYNRJXqOeXY = Double.MAX_VALUE;
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[3];
                    break;
                case -1909742289:
                    mlnLXHbaMCUVKiUagpzs = Double.MAX_VALUE;
                    uJGExdna -= hvgOcSeaiUnOGktXLWRKkh[4];
                    break;
                case -295775053:
                    mVkfDbahSGhDieVQ = getMouseDeltaXY(rRkqZMaNMPSQjYbTxMDsB, NCOFORbOIuuDVL);
                    uJGExdna ^= hvgOcSeaiUnOGktXLWRKkh[15];
                    break;
            }
        }
    }
}
