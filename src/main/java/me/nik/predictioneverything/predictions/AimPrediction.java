package me.nik.predictioneverything.predictions;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.xml.bind.DatatypeConverter;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AimPrediction
        implements Listener {
    private static String[] 2015082126;
    private static String[] -625867411;
    private static long 1947358662;
    private static int -902325512 = 1821504686;
    private static boolean -1261640356 = true;
    private static float -1005665983;
    private static float 1496133952;
    private static float 1381787930;
    private static double -1767502901;
    private static double 1368974155;
    private static double 678335666;
    private static double -2018357304;
    private static double 281613813;
    private static double 731054450;
    private static float -1804802965;
    private static float 2021688428;
    private static float 1811767918;
    private static int -1977128669;
    private static int 897481984;
    private static int -1111104263;
    private static int -1895854677;
    private static int 1091256026;
    private static int -189246879;
    private static int -329620575;
    private static int -383997808;
    private static float 1585946937;
    private static int 753719403;
    private static int 1073167309;
    private static int 2037366425;
    private static int -1033482717;
    private static int 1578662639;
    private static long 806189432;
    private static long -1861571193;
    private static float 565177185;
    private static float 379854143;
    private static float -1932897440;
    private static float 1079039305;
    private static float 616031061;
    private static int 1406328925;
    private static int 352258848;
    private static int -709322151;
    private static int 2068757947;
    private static int 1624944300;
    private static long 468859255;
    private static float -236062530;
    private static float 214889649;
    private static int -696874078;
    private static int -1896689446;
    private static int 407271285;
    private static int -1052635519;
    private static int 1811087120;
    private static int -973486405;
    private static int -858156529;

    private boolean isInvertMouse() {
        return (boolean)AimPrediction.957002868("-1522164827", (Object)505519464, (Object)"amF2YS5sYW5nLlN0cmluZw==", "Y29udGFpbnM=", "(Ljava/lang/CharSequence;)Z", 1041952520, 0.42686558f, ";%0\u001e4\u0005,-\u0006\u0019\u0002\u0017\u00031\u0013-\u0014\u0015\r\u0007", AimPrediction.957002868("1532256066", (Object)505519462, (Object)"amF2YS5sYW5nLlN0cmluZw==", "dmFsdWVPZg==", "([C)Ljava/lang/String;", "MjAzNjQ1NDE3Ng==", "\u000e\u00141\"\u0014\u00079\u0013\u0014&\u00002\u0018\u0016\u0011/8;\u0001$*", -0.10857939252366695, null), AimPrediction.957002868("571794208", (Object)505519462, (Object)"amF2YS5sYW5nLlN0cmluZw==", "dmFsdWVPZg==", "(Z)Ljava/lang/String;", "\u001c\f\u000e\u000b;,*;\u0006\u0003&*\u00068\u00143\u00004\b", 1049828748, 522249733971856696L, (boolean)AimPrediction.957002868("-1890040466", (Object)505519462, (Object)"amF2YS5sYW5nLkJvb2xlYW4=", "cGFyc2VCb29sZWFu", "(Ljava/lang/String;)Z", 1691498899, 12.479145608212487, -7259517055895747204L, AimPrediction.957002868("-654647035", (Object)505519464, (Object)"amF2YS5sYW5nLlN0cmluZw==", "dHJpbQ==", "()Ljava/lang/String;", "LTE5NTU2MzAzODU=", 0.46167052f, 306774334209622695L, AimPrediction.1920657016("599430432", (int)(2068757947 & 1624944300), (long)468859255)))));
    }

    private float[] getSmoothedRotations(float x, float y) {
        float smoothedX = x / -236062530;
        float smoothedY = y / 214889649;
        float[] fArray = new float[-696874078];
        fArray[AimPrediction.-1896689446] = smoothedX;
        fArray[AimPrediction.407271285] = smoothedY;
        return fArray;
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void onRotation(PlayerMoveEvent e) {
        int n;
        Object pitch;
        Object yaw;
        block23: {
            block22: {
                Object object;
                Object object2;
                Object object3;
                Object location = AimPrediction.957002868("1461393242", (Object)505519464, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "Z2V0VG8=", "()Lorg/bukkit/Location;", -4937921440713925727L, "\u0010\u00151\u000b (\t", 0.7780917f, e);
                yaw = AimPrediction.957002868("-1526091648", (Object)505519464, (Object)"b3JnLmJ1a2tpdC5Mb2NhdGlvbg==", "Z2V0WWF3", "()F", "ODkzNjQyMzk0", ",,8\u0013\u0005\n//\u0003\u0005\u0013\u0005:5\b4", 26, location);
                pitch = AimPrediction.957002868("-1319500494", (Object)505519464, (Object)"b3JnLmJ1a2tpdC5Mb2NhdGlvbg==", "Z2V0UGl0Y2g=", "()F", 1066302095, "\u001c\u0017\u0016/\u001b21\u00070.\u0010\u0007\u0004\u000e", 10.005600550884292, location);
                Object object4 = object3 = yaw;
                if (object4 < 0.0f) {
                    object3 = -object3;
                }
                if (object3 == -1005665983) break block22;
                Object object5 = object2 = pitch;
                if (object5 < 0.0f) {
                    object2 = -object2;
                }
                if (object2 > 1496133952) break block22;
                Object object6 = object = yaw;
                if (object6 < 0.0f) {
                    object = -object;
                }
                if (!((double)object >= (double)(pitch - 1381787930) + (double)pitch / -1767502901 - 1368974155 + (double)((float)AimPrediction.957002868("-15727797", (Object)505519462, (Object)"amF2YS5sYW5nLk1hdGg=", "cG93", "(DD)D", "LTE3NzgwMjIzOTE=", 1.0852210328220036, 1054528092, 678335666, -2018357304)))) break block23;
            }
            return;
        }
        double lowestOffsetX = 281613813;
        double lowestOffsetY = 731054450;
        float mouseSensitivity = this.getMouseSensitivity();
        float f = mouseSensitivity * -1804802965 + 2021688428;
        float f1 = f * f * f * 1811767918;
        int[] mouseDeltas = this.getMouseDeltaXY((float)yaw, (float)pitch);
        float f2 = (float)mouseDeltas[-1977128669] * f1;
        float f3 = (float)mouseDeltas[897481984] * f1;
        if (this.isInvertMouse()) {
            n = -1111104263;
            if (!-1261640356) {
                throw null;
            }
        } else {
            n = -1895854677;
        }
        byte b0 = (byte)n;
        f2 *= (float)b0;
        f3 *= (float)b0;
        for (int cm = 1091256026; cm < -189246879; ++cm) {
            reference var10_16;
            reference v11;
            reference v9;
            block25: {
                block24: {
                    int n2;
                    if (cm > -329620575 || cm < -383997808 || (float)cm > 1585946937) break block24;
                    if (cm != 0) {
                        n2 = 753719403;
                        if (!-1261640356) {
                            throw null;
                        }
                    } else {
                        n2 = 1073167309;
                    }
                    if (n2 != AimPrediction.957002868("-345946080", (Object)505519464, (Object)"amF2YS5sYW5nLkJvb2xlYW4=", "Ym9vbGVhblZhbHVl", "()Z", 1368893585, -1968175575, -7146339090042284966L, AimPrediction.957002868("-972591991", (Object)505519462, (Object)"amF2YS5sYW5nLkJvb2xlYW4=", "dmFsdWVPZg==", "(Ljava/lang/String;)Ljava/lang/Boolean;", "-25541065", 0.14577687002439593, 114, AimPrediction.957002868("-1238251988", (Object)505519462, (Object)"amF2YS5sYW5nLlN0cmluZw==", "dmFsdWVPZg==", "([C)Ljava/lang/String;", 8745216654438277361L, 2.1490673897602903, -1.06320226266392, null)))) break block25;
                }
                float[] smoothedXY = this.getSmoothedRotations(f2, f3);
                f2 = smoothedXY[2037366425];
                f3 = smoothedXY[-1033482717];
            }
            reference v8 = v9 = yaw - f2;
            if (v8 < 0.0f) {
                v9 = -v9;
            }
            reference var9_15 = v9;
            reference v10 = v11 = pitch - f3;
            if (v10 < 0.0f) {
                v11 = var10_16 = -v11;
            }
            if ((double)var9_15 < lowestOffsetX) {
                lowestOffsetX = (double)var9_15;
            }
            if (!((double)var10_16 < lowestOffsetY)) continue;
            lowestOffsetY = (double)var10_16;
            if (-902325512 >= 0) continue;
            throw null;
        }
        if (lowestOffsetX > 0.0 || lowestOffsetY > 0.0) {
            AimPrediction.957002868("-603776979", (Object)505519463, (Object)"b3JnLmJ1a2tpdC5lbnRpdHkuUGxheWVy", "a2lja1BsYXllcg==", "(Ljava/lang/String;)V", 109, 11.113072555939178, 0.28056818f, AimPrediction.957002868("775149489", (Object)505519464, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "Z2V0UGxheWVy", "()Lorg/bukkit/entity/Player;", ":9\u001b\u0006\u0001'\u0019;7#", 11.764280129115825, -4827942985440036721L, e), AimPrediction.1920657016("1248602255", (int)1578662639, (long)(806189432 ^ -1861571193)));
        }
    }

    private float getMouseSensitivity() {
        return 565177185;
    }

    private int[] getMouseDeltaXY(float yaw, float pitch) {
        float f;
        float f2;
        if (AimPrediction.957002868("1034644126", (Object)505519462, (Object)"bWUubmlrLnByZWRpY3Rpb25ldmVyeXRoaW5nLnV0aWxzLkludGVycG9sYXRpb25VdGls", "YnJ1dGVGb3JjZUludGVycG9sYXRpb24=", "(Ljava/lang/Object;)Z", -1702771468998316237L, "1140546575", "1312939284", AimPrediction.957002868("1551707104", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "dmFsdWVPZg==", "(F)Ljava/lang/Float;", 1054952166, 1139227287586967097L, 42, yaw)) != false) {
            f2 = yaw / 379854143;
            if (!-1261640356) {
                throw null;
            }
        } else {
            f2 = -1932897440;
        }
        Object interpolatedYaw = AimPrediction.957002868("125328464", (Object)505519462, (Object)"amF2YS5sYW5nLk1hdGg=", "cm91bmQ=", "(F)I", 9202433636872663508L, 191816825, 0.8797403f, f2);
        if (AimPrediction.957002868("-512082139", (Object)505519462, (Object)"bWUubmlrLnByZWRpY3Rpb25ldmVyeXRoaW5nLnV0aWxzLkludGVycG9sYXRpb25VdGls", "YnJ1dGVGb3JjZUludGVycG9sYXRpb24=", "(Ljava/lang/Object;)Z", 15.110375456965741, 86, -249078753, AimPrediction.957002868("207355135", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "dmFsdWVPZg==", "(F)Ljava/lang/Float;", -570910875, "MTQ1NTE3Mzk4NQ==", -1.1180220401640832, pitch)) != false) {
            f = pitch / 1079039305;
            if (-902325512 < 0) {
                throw null;
            }
        } else {
            f = 616031061;
        }
        Object interpolatedPitch = AimPrediction.957002868("477075712", (Object)505519462, (Object)"amF2YS5sYW5nLk1hdGg=", "cm91bmQ=", "(F)I", 1035418672, "250522977", "839382456", f);
        int[] nArray = new int[1406328925];
        nArray[AimPrediction.352258848] = (int)interpolatedYaw;
        nArray[AimPrediction.-709322151] = (int)interpolatedPitch;
        return nArray;
    }

    static {
        -973486405 = 505519582;
        -858156529 = 184;
        -1005665983 = (float)AimPrediction.957002868("-1241896291", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", 1.0110720133825137, 119, "MTgxMjIzNDc2NA==", 0x7F7FFFFF >>> 128 | 0x7F7FFFFF << ~128 + 1);
        1496133952 = (float)AimPrediction.957002868("-155005443", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", -69806235, "LTExMjAxOTgyOTA=", "LTM2OTMxMDM3Ng==", (17485824 >>> 218 | 17485824 << -218) & 0xFFFFFFFF);
        1381787930 = (float)AimPrediction.957002868("-258113204", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", 16.97024489799827, -1.0824679037384792, -1180870326, (504 >>> 139 | 504 << -139) & 0xFFFFFFFF);
        -1767502901 = (double)AimPrediction.957002868("676625965", (Object)505519462, (Object)"amF2YS5sYW5nLkRvdWJsZQ==", "bG9uZ0JpdHNUb0RvdWJsZQ==", "(J)D", 0.04552573f, "1450779702", 16.503434851114523, (long)AimPrediction.957002868("-851370059", (Object)505519462, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", 0.47209263f, 93, ";089\u0000&\u0012 ", 2044L));
        1368974155 = (double)AimPrediction.957002868("-697463373", (Object)505519462, (Object)"amF2YS5sYW5nLkRvdWJsZQ==", "bG9uZ0JpdHNUb0RvdWJsZQ==", "(J)D", 14.60267246019458, -0.6495891196491658, "MTQ1Njc1NzY1", (long)AimPrediction.957002868("-913965714", (Object)505519462, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", 0.74800324f, "740072680", "LTEwMTE1NDYwMzA=", 6456360425798344188L));
        678335666 = (double)AimPrediction.957002868("-752595518", (Object)505519462, (Object)"amF2YS5sYW5nLkRvdWJsZQ==", "bG9uZ0JpdHNUb0RvdWJsZQ==", "(J)D", "1878680019", 4.823296275177869, -3715709707579088910L, (long)AimPrediction.957002868("1887236943", (Object)505519462, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", ")\u00121\u0017\u001f", "\u0003\u0000\u001b\u000b$\u001d\u0002\u0011", "MTc1NjIxNTc0", 2L));
        -2018357304 = (double)AimPrediction.957002868("-343311505", (Object)505519462, (Object)"amF2YS5sYW5nLkRvdWJsZQ==", "bG9uZ0JpdHNUb0RvdWJsZQ==", "(J)D", 119, "226832851", "587271880", (long)AimPrediction.957002868("-2017354231", (Object)505519462, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", -7925269680553049779L, 1063683561, "LTE0NDg3MTMyMDk=", 1538L));
        281613813 = (double)AimPrediction.957002868("295034103", (Object)505519462, (Object)"amF2YS5sYW5nLkRvdWJsZQ==", "bG9uZ0JpdHNUb0RvdWJsZQ==", "(J)D", 1058652720, "-1353887131", -1591312114, (long)AimPrediction.957002868("-1619614907", (Object)505519462, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", -0.1570934135280813, "-628515952", "OTc4NTgyODg=", -2050L));
        731054450 = (double)AimPrediction.957002868("798572602", (Object)505519462, (Object)"amF2YS5sYW5nLkRvdWJsZQ==", "bG9uZ0JpdHNUb0RvdWJsZQ==", "(J)D", "/\u0017\u0011. \u001d\b'8(\u00135,\u0014!\u0012", 120, -1.1889097115920548, (long)AimPrediction.957002868("1364427721", (Object)505519462, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", "1852307503", "\u0002\n\u001d !\u001b\u00039\u0013", 1041643612, -2050L));
        -1804802965 = (float)AimPrediction.957002868("-2127923161", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", "\u0015-\u0017\u0001\u00148\u0001+\u0017\u0014\u000e&\u0004\u001d\u001f\u0012\u0001,\u0002", "1442920198", "LTEyNzU1NDMxMTU=", (-1717984271 >>> 12 | -1717984271 << -12) & 0xFFFFFFFF);
        2021688428 = (float)AimPrediction.957002868("-2059897823", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", 1184486572182398395L, 30, 1403707564747913657L, (int)AimPrediction.957002868("-300991658", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 1062963223, 16.558531434428488, -947748178, -1288490372));
        1811767918 = (float)AimPrediction.957002868("1512735389", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", "\u000b\u0004-\u0018+5\u0007\u0004\u00155\u001c.", 90, -2.628584952696132, -1880725914 >>> 30 | -1880725914 << ~30 + 1);
        -1977128669 = (0 >>> 163 | 0 << ~163 + 1) & 0xFFFFFFFF;
        897481984 = 0x40000000 >>> 254 | 0x40000000 << -254;
        -1111104263 = (-1 >>> 205 | -1 << ~205 + 1) & 0xFFFFFFFF;
        -1895854677 = 16 >>> 164 | 16 << ~164 + 1;
        1091256026 = (int)AimPrediction.957002868("-318961726", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", "NzA4ODYyNTM5", 0.38122845f, "MTIwNTAzMTI2Ng==", 1);
        -189246879 = (int)AimPrediction.957002868("2122690383", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 28, -1.3929467189753506, "\u0003:#5*\t\u0016;", -2);
        -329620575 = 48 >>> 3 | 48 << -3;
        -383997808 = (int)AimPrediction.957002868("-1190408243", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", -1288290559, "LTQ5NTIyNjI3MA==", 11.877388307445571, 0x40000000);
        1585946937 = (float)AimPrediction.957002868("644480603", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", "%\b\u0019\u0002\u0014", "MTExMDE4Njc2OA==", "-1669596409", (1046528 >>> 213 | 1046528 << -213) & 0xFFFFFFFF);
        753719403 = (int)AimPrediction.957002868("1713973202", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 54, 0.86214197f, -1710448863, Integer.MIN_VALUE);
        1073167309 = (int)AimPrediction.957002868("-307586952", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 0.7220142819335235, 1491510399, 11.898338395569965, 0);
        2037366425 = (0 >>> 188 | 0 << ~188 + 1) & 0xFFFFFFFF;
        -1033482717 = (int)AimPrediction.957002868("2133584937", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 1065007798, 1041314920, 14.956388903120104, Integer.MIN_VALUE);
        1578662639 = (int)AimPrediction.957002868("1716136336", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", -2038283587076406640L, 439529000, "MTMyMjg5OTU1OQ==", Integer.MIN_VALUE);
        806189432 = (long)AimPrediction.957002868("865968378", (Object)505519462, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", 418016152, 1059119893, "\u0000\t\u0007\u0005\u001b\u00197&", 3044459541060925510L);
        -1861571193 = (long)AimPrediction.957002868("-1044749833", (Object)505519462, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", "-2106627791", 0.5963081f, 1040033656, 0x7000000000000000L);
        565177185 = (float)AimPrediction.957002868("2026668425", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", "\u001f\f\b26\u0015.\u001d\u001a\u001a:)\u001c0\u000e\u000f\u00048&\u001d", "\f.%\u001e\u0011\t\u0015,4\u000e\u0013", "MjA5NDIyNjA3", (int)AimPrediction.957002868("1219663313", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 1043224388, 93, 0.6310232910877864, 1022));
        379854143 = (float)AimPrediction.957002868("-214304296", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", 8050671767057520687L, -7540293150684213292L, 74, (1046528 >>> 213 | 1046528 << -213) & 0xFFFFFFFF);
        -1932897440 = (float)AimPrediction.957002868("451884362", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", "-768418534", 10.023834849460346, 0.077266514f, -1073741697 >>> 167 | -1073741697 << ~167 + 1);
        1079039305 = (float)AimPrediction.957002868("757132288", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", "\b\u0018 \u0014\u00113 4\u00119 \u0001\u0004*\u001e\u0005:", 1064599614, "50\u0019943\u0010;&\u00161+\u000b34\u0002\b\u001e\t\u0003\u0005", (int)AimPrediction.957002868("455648250", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 0.8880451514547612, "LTE1ODc3MzMxNDc=", 0.22704071f, 1022));
        616031061 = (float)AimPrediction.957002868("673540978", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", -1328185851, 5214673250792466185L, 458791979828497402L, (int)AimPrediction.957002868("1823386202", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 1039881760, -0.8537065697574048, 0.42965728f, 511));
        1406328925 = (int)AimPrediction.957002868("-1723521646", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", "1373038666", 11.787225073082286, -183633791, 0x40000000);
        352258848 = (0 >>> 188 | 0 << -188) & 0xFFFFFFFF;
        -709322151 = (512 >>> 169 | 512 << -169) & 0xFFFFFFFF;
        2068757947 = (int)AimPrediction.957002868("85918208", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 64, 0.10098302f, 13.813027403231022, 0);
        1624944300 = (int)AimPrediction.957002868("-738060290", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 1061222232, "-1480488270", 0.77458394f, -1);
        468859255 = (long)AimPrediction.957002868("-945706917", (Object)505519462, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", -0.6905425330217911, 100, "\u001614\u0018%\u00059\u0004%\f\n\u000e\u0014/.\n\u0018\u00184", 6503224054881466438L);
        -236062530 = (float)AimPrediction.957002868("1684260979", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", 0.32289267f, 2.903870384005156, -0.4614615115422815, (int)AimPrediction.957002868("-854969679", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 72, 100, 1.371065141760968, 32578));
        214889649 = (float)AimPrediction.957002868("-1966062054", (Object)505519462, (Object)"amF2YS5sYW5nLkZsb2F0", "aW50Qml0c1RvRmxvYXQ=", "(I)F", "LTY5NDY2MDgzMQ==", 8265712902800678267L, 64, (274400 >>> 148 | 274400 << -148) & 0xFFFFFFFF);
        -696874078 = (0x40000000 >>> 189 | 0x40000000 << -189) & 0xFFFFFFFF;
        -1896689446 = (0 >>> 225 | 0 << -225) & 0xFFFFFFFF;
        407271285 = 512 >>> 137 | 512 << ~137 + 1;
        -1052635519 = (int)AimPrediction.957002868("-469056472", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 17, 10.446379582568559, 72, 0x40000000);
        1811087120 = (int)AimPrediction.957002868("1004327245", (Object)505519462, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", "LTQwNjQ1NzM0MA==", -6590733537715906184L, "68\u001143!\u000e\u0011;\"2\u0002);:\u001a\f01,:\u001e\u001e", 0x40000000);
        2015082126 = new String[-1052635519];
        -625867411 = new String[1811087120];
        AimPrediction.957002868("-1153448370", (Object)505519462, (Object)"bWUubmlrLnByZWRpY3Rpb25ldmVyeXRoaW5nLnByZWRpY3Rpb25zLkFpbVByZWRpY3Rpb24=", "MTE3OTkzNjc1Ng==", "()V", 3.6150714725730237, 0.30644423f, "LTExNjcyOTEzNzQ=");
    }

    private static Object 1920657016(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(AimPrediction.class, "-73477152", MethodType.fromMethodDescriptorString((String)"(IJ)Ljava/lang/String;", (ClassLoader)AimPrediction.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/predictioneverything/predictions/AimPrediction:" + string + ":" + methodType.toString(), (Throwable)exception);
        }
    }

    private static String -73477152(int n, long l) {
        l ^= 0xEL;
        l ^= 0xDF9AE1A12E750A4DL;
        if (2015082126[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance((String)"DES/CBC/PKCS5Padding");
                secretKeyFactory = SecretKeyFactory.getInstance((String)"DES");
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/predictioneverything/predictions/AimPrediction");
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret((KeySpec)new DESKeySpec(byArray)), (AlgorithmParameterSpec)new IvParameterSpec(new byte[8]));
            AimPrediction.2015082126[n] = new String(cipher.doFinal(Base64.getDecoder().decode(-625867411[n])));
        }
        return 2015082126[n];
    }

    private static void 1179936756() {
        int n;
        1947358662 = 7069595477060616788L;
        long l = 1947358662 ^ 0xDF9AE1A12E750A4DL;
        Cipher cipher = Cipher.getInstance((String)"DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)"DES");
        byte[] byArray = new byte[8];
        byArray[0] = (byte)(l >>> 56);
        for (n = 1; n < 8; ++n) {
            byArray[n] = (byte)(l << n * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret((KeySpec)new DESKeySpec(byArray)), (AlgorithmParameterSpec)new IvParameterSpec(new byte[8]));
        n = 1;
        block7: for (int i = 0; i < n; ++i) {
            switch (i) {
                case 0: {
                    AimPrediction.-625867411[0] = "eXf8RDvFoGO0n8p67IoJiD4UvIqlGxeKytlO8TkeQKeeRFQ/bGDoiw==";
                    AimPrediction.-625867411[1] = "Jyep+Jxy+DyPj1eO5Ngd9nURRCOTtBaAxWi/He2i068nTD1vMfyg09CLs/IeU3TAO+ct/MNUCMw=";
                    continue block7;
                }
                case 1: {
                    AimPrediction.-625867411[0] = "eXf8RDvFoGO0n8p67IoJiD4UvIqlGxeKytlO8TkeQKf/i7JYdfWwyJ669uNJNgwZ";
                    AimPrediction.-625867411[1] = "Jyep+Jxy+DyPj1eO5Ngd9nURRCOTtBaAxWi/He2i068nTD1vMfyg09CLs/IeU3TAVCfyKfHdHyA=";
                    continue block7;
                }
                case 2: {
                    AimPrediction.-625867411[0] = "7yxGK4uhUrbs4/cHiN/y1uE8v0GdC4F4";
                    continue block7;
                }
                case 4: {
                    AimPrediction.-625867411[0] = "KJl1ZG4pu8fCf65baXRh5xiifdefhynI";
                }
            }
        }
    }

    public static Object 957002868(MethodHandles.Lookup lookup, String string, MethodType methodType, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) throws Exception {
        int n = (Integer)object;
        n = (n ^ -973486405) & 0xFF;
        object5 = -858156529;
        object7 = Class.forName((String)new String(DatatypeConverter.parseBase64Binary((String)((String)object2))));
        MethodType methodType2 = MethodType.fromMethodDescriptorString((String)((String)object4), (ClassLoader)object7.getClassLoader());
        if (n == (Integer)object5) {
            return new MutableCallSite(lookup.findStatic((Class)object7, new String(DatatypeConverter.parseBase64Binary((String)((String)object3))), methodType2).asType(methodType));
        }
        return new MutableCallSite(lookup.findVirtual((Class)object7, new String(DatatypeConverter.parseBase64Binary((String)((String)object3))), methodType2).asType(methodType));
    }
}
