package me.nik.predictioneverything.predictions;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.xml.bind.DatatypeConverter;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FullMovementPrediction
        implements Listener {
    private static final double THRESHOLD;
    private static String[] 920807894;
    private static String[] 19490710;
    private static long -1459042635;
    private static int -742671096 = -456647874;
    private static boolean -637216244 = false;
    private static int 1414889417;
    private static long -1675098732;
    private static long 1563553852;
    private static int 1416353733;
    private static int -1766401032;
    private static int -1095993241;
    private static int -1030189082;
    private static int -1193690296;
    private static int -277446288;
    private static int -421951861;
    private static int 2089942978;
    private static int 1190835429;
    private static int -497400808;
    private static int -2072158973;
    private static long 608793969;
    private static int 172600692;
    private static int 192156034;
    private static int 893620833;
    private static int 1780180031;
    private static int 60644097;
    private static int 2147331589;
    private static int 436909345;

    private boolean isCheating(PlayerMoveEvent e) {
        boolean bl;
        reference v1;
        reference v0 = v1 = FullMovementPrediction.-333871381("-868518770", (Object)1115637559, (Object)"b3JnLmJ1a2tpdC5Mb2NhdGlvbg==", "Z2V0WA==", "()D", "5\u001d\u000e\u0007\t-\u0000)\u0011\"\u0000\b5\u0012#\t\u001c\u00027/2:\u001b", "LTM3NTIwNTE5NQ==", -0.23669782053345734, FullMovementPrediction.-333871381("2008045127", (Object)1115637559, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "Z2V0RnJvbQ==", "()Lorg/bukkit/Location;", 1836513644396059581L, 1065186881, "23728792", e)) - FullMovementPrediction.-333871381("-500492611", (Object)1115637559, (Object)"b3JnLmJ1a2tpdC5Mb2NhdGlvbg==", "Z2V0WA==", "()D", 2089862506, "MjIxMjU0ODA1", 7609186764795422246L, FullMovementPrediction.-333871381("-1658987650", (Object)1115637559, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "Z2V0VG8=", "()Lorg/bukkit/Location;", 0.121104f, "639094907", "(4\r#\u00076\u0000'&4\t\u0003", e));
        if (v0 < 0.0) {
            v1 = -v1;
        }
        if (v1 != THRESHOLD) {
            bl = 192156034;
            if (-637216244) {
                throw null;
            }
        } else {
            bl = 893620833;
        }
        return bl;
    }

    static {
        2147331589 = 1115637633;
        436909345 = 184;
        1414889417 = (int)FullMovementPrediction.-333871381("-373203032", (Object)1115637561, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", "LTM2Mzc0NjQwNQ==", 14.998487279448975, "-1833323249", 0);
        -1675098732 = (long)FullMovementPrediction.-333871381("-1753493733", (Object)1115637561, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", -1.156531803202446, -1038873726, 0.75451994f, -4007228287133565364L);
        1563553852 = (long)FullMovementPrediction.-333871381("1041770430", (Object)1115637561, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", 108, "!\b\u001c\u001a\u000b&\u000e\u000b\n\u0019.&,\u0014\u0013#\u00053\u001b-\u0017\u0001", "MTI2NjU2ODAyNQ==", -4035225266123964416L);
        1416353733 = (int)FullMovementPrediction.-333871381("729318207", (Object)1115637561, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", -1364208063, -0.8593215679980013, 10.022650915035538, 0);
        -1766401032 = (int)FullMovementPrediction.-333871381("1375626589", (Object)1115637561, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", -0.34297625072014776, 865707563, 0.12911212f, Integer.MIN_VALUE);
        -1095993241 = 0 >>> 240 | 0 << ~240 + 1;
        -1030189082 = (-1 >>> 244 | -1 << ~244 + 1) & 0xFFFFFFFF;
        -1193690296 = (0x640000 >>> 49 | 0x640000 << -49) & 0xFFFFFFFF;
        -277446288 = -1 >>> 158 | -1 << -158;
        -421951861 = (25600 >>> 169 | 25600 << -169) & 0xFFFFFFFF;
        2089942978 = 0 >>> 204 | 0 << -204;
        1190835429 = 0xA000000 >>> 88 | 0xA000000 << -88;
        -497400808 = (0x500000 >>> 52 | 0x500000 << ~52 + 1) & 0xFFFFFFFF;
        -2072158973 = (0x8000000 >>> 251 | 0x8000000 << ~251 + 1) & 0xFFFFFFFF;
        608793969 = (long)FullMovementPrediction.-333871381("277430248", (Object)1115637561, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", "-711266398", 4.202566844517197, -1.3026479320778652, 27996978990399052L);
        172600692 = (-257 >>> 137 | -257 << ~137 + 1) & 0xFFFFFFFF;
        192156034 = (0x100000 >>> 116 | 0x100000 << ~116 + 1) & 0xFFFFFFFF;
        893620833 = (int)FullMovementPrediction.-333871381("-1076042998", (Object)1115637561, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 1049743412, "-808547254", "0\"\u001a\u00159\u00112\u0001\u0017*", 0);
        1780180031 = (0x20000000 >>> 124 | 0x20000000 << ~124 + 1) & 0xFFFFFFFF;
        60644097 = (0x8000000 >>> 154 | 0x8000000 << -154) & 0xFFFFFFFF;
        920807894 = new String[1780180031];
        19490710 = new String[60644097];
        FullMovementPrediction.-333871381("-1113996196", (Object)1115637561, (Object)"bWUubmlrLnByZWRpY3Rpb25ldmVyeXRoaW5nLnByZWRpY3Rpb25zLkZ1bGxNb3ZlbWVudFByZWRpY3Rpb24=", "LTEwOTcyMzQwMzU=", "()V", 1064817091, 16.904234255624115, 0.13596451f);
        THRESHOLD = (double)(FullMovementPrediction.-333871381("-786952562", (Object)1115637561, (Object)"amF2YS5sYW5nLlN5c3RlbQ==", "Y3VycmVudFRpbWVNaWxsaXM=", "()J", 19.627837056618013, 13, 4680765092862642769L) % FullMovementPrediction.-333871381("-2043569412", (Object)1115637561, (Object)"amF2YS5sYW5nLlN5c3RlbQ==", "bmFub1RpbWU=", "()J", 0.5216002f, 8660886431795544982L, 16.214817034995303));
    }

    /*
     * Unable to fully structure code
     */
    @EventHandler(priority=EventPriority.MONITOR)
    public void onMove(PlayerMoveEvent e) {
        try {
            takingAShitField = FullMovementPrediction.-333871381("-1000350776", (Object)1115637559, (Object)"amF2YS5sYW5nLkNsYXNz", "Z2V0TWV0aG9k", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", 1063295104, 1062669782, "LTEzODM5MzQ3NzA=", Player.class, FullMovementPrediction.837447545("-1843738883", (int)FullMovementPrediction.1414889417, (long)(FullMovementPrediction.-1675098732 ^ FullMovementPrediction.1563553852)), (Class[])new Class[FullMovementPrediction.1416353733]);
            FullMovementPrediction.-333871381("-453693517", (Object)1115637559, (Object)"amF2YS5sYW5nLnJlZmxlY3QuTWV0aG9k", "c2V0QWNjZXNzaWJsZQ==", "(Z)V", "LTEwOTE1MjQ1NjY=", 1061000465, "-121720052", takingAShitField, (boolean)FullMovementPrediction.-1766401032);
            isTakingAShit = FullMovementPrediction.-333871381("-657500596", (Object)1115637559, (Object)"amF2YS5sYW5nLkJvb2xlYW4=", "Ym9vbGVhblZhbHVl", "()Z", 1057803013, "MjA1OTIzMDk3Nw==", "732368955", (Boolean)FullMovementPrediction.-333871381("-1235753657", (Object)1115637559, (Object)"amF2YS5sYW5nLnJlZmxlY3QuTWV0aG9k", "aW52b2tl", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", 10, 0.08893424f, -1072636147, takingAShitField, FullMovementPrediction.-333871381("-516765990", (Object)1115637559, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "Z2V0UGxheWVy", "()Lorg/bukkit/entity/Player;", 0.013191322510706859, 6215067402308779344L, 1061782573, e), (Object[])new Object[FullMovementPrediction.-1095993241]));
            if (isTakingAShit != false) {
                return;
            }
            ** if (FullMovementPrediction.-742671096 < 0) goto lbl-1000
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException takingAShitField) {
            // empty catch block
        }
        lbl-1000:
        // 1 sources

        {
            throw null;
        }
        lbl-1000:
        // 1 sources

        {
        }
        if (FullMovementPrediction.-333871381("1352827085", (Object)1115637561, (Object)"amF2YS5sYW5nLkxvbmc=", "dmFsdWVPZg==", "(Ljava/lang/String;)Ljava/lang/Long;", 1062338700, 1049981012, 102, null) instanceof Long) {
            while (true) {
                if (FullMovementPrediction.-333871381("48700819", (Object)1115637561, (Object)"amF2YS5sYW5nLkRvdWJsZQ==", "aXNOYU4=", "(D)Z", "LTY1MjExNTMz", 0.24235925041121417, 81, (double)FullMovementPrediction.-333871381("-2025742768", (Object)1115637560, (Object)"b3JnLmJ1a2tpdC5lbnRpdHkuUGxheWVy", "Z2V0RXllSGVpZ2h0", "()D", 15.379351632671469, 5.980066718559098, 0.8809126473242228, FullMovementPrediction.-333871381("1806193159", (Object)1115637559, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "Z2V0UGxheWVy", "()Lorg/bukkit/entity/Player;", "&\u0011\u0003*69\u0011\u0002;\u001d%\t\u001a\u0011!-0\u001249\u00002%/", "3*\u0004\u0002\u0011(\u000b\u00039\u001c", "-72901229", e))) != false) {
                    continue;
                }
                block3: for (virgin = FullMovementPrediction.-1030189082; virgin < FullMovementPrediction.-1193690296; ++virgin) {
                    for (takingAShit = FullMovementPrediction.-277446288; takingAShit < FullMovementPrediction.-421951861; takingAShit += 51) {
                        if (!this.isCheating(e) || FullMovementPrediction.-333871381("35203092", (Object)1115637559, (Object)"amF2YS51dGlsLmNvbmN1cnJlbnQuVGhyZWFkTG9jYWxSYW5kb20=", "bmV4dEludA==", "(II)I", 1031129328, 1010651328, -6482436073632205488L, FullMovementPrediction.-333871381("-1481916190", (Object)1115637561, (Object)"amF2YS51dGlsLmNvbmN1cnJlbnQuVGhyZWFkTG9jYWxSYW5kb20=", "Y3VycmVudA==", "()Ljava/util/concurrent/ThreadLocalRandom;", -155016734, 5371151234229536764L, 2.156068484940819), FullMovementPrediction.2089942978, (int)FullMovementPrediction.1190835429) <= FullMovementPrediction.-497400808) continue;
                        for (i = virgin; i < takingAShit; i -= FullMovementPrediction.172600692) {
                            FullMovementPrediction.-333871381("-1798397583", (Object)1115637560, (Object)"b3JnLmJ1a2tpdC5lbnRpdHkuUGxheWVy", "a2lja1BsYXllcg==", "(Ljava/lang/String;)V", "1888291197", 1.1190712314890963, 7.93963644520286, FullMovementPrediction.-333871381("616282723", (Object)1115637559, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "Z2V0UGxheWVy", "()Lorg/bukkit/entity/Player;", 4001342062893087888L, 4.159761247779999, 1064384413, e), FullMovementPrediction.837447545("1588478901", (int)FullMovementPrediction.-2072158973, (long)FullMovementPrediction.608793969));
                            if (!FullMovementPrediction.-637216244) continue;
                            throw null;
                        }
                        if (FullMovementPrediction.-742671096 < 0) continue block3;
                        throw null;
                    }
                    if (FullMovementPrediction.-742671096 < 0) continue;
                    throw null;
                }
                if (FullMovementPrediction.-637216244) break;
            }
            throw null;
        }
    }

    private static Object 837447545(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(FullMovementPrediction.class, "-1301606027", MethodType.fromMethodDescriptorString((String)"(IJ)Ljava/lang/String;", (ClassLoader)FullMovementPrediction.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/predictioneverything/predictions/FullMovementPrediction:" + string + ":" + methodType.toString(), (Throwable)exception);
        }
    }

    private static String -1301606027(int n, long l) {
        l ^= 0x13L;
        l ^= 0x1DA6FEEB46221EBCL;
        if (920807894[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance((String)"DES/CBC/PKCS5Padding");
                secretKeyFactory = SecretKeyFactory.getInstance((String)"DES");
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/predictioneverything/predictions/FullMovementPrediction");
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret((KeySpec)new DESKeySpec(byArray)), (AlgorithmParameterSpec)new IvParameterSpec(new byte[8]));
            FullMovementPrediction.920807894[n] = new String(cipher.doFinal(Base64.getDecoder().decode(19490710[n])));
        }
        return 920807894[n];
    }

    private static void -1097234035() {
        int n;
        -1459042635 = 3638206758585812499L;
        long l = -1459042635 ^ 0x1DA6FEEB46221EBCL;
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
                    FullMovementPrediction.19490710[0] = "l9ZN3o4+AlE6kusGE/huXA==";
                    FullMovementPrediction.19490710[1] = "yenR5nMTHPsWIdUopyx5pp4kVyuE9OVFoBHVsWxmIEoD+dvFO261a1j+U/N5Yenr";
                    continue block7;
                }
                case 1: {
                    FullMovementPrediction.19490710[0] = "l9ZN3o4+AlHO1D+3ihBFRQ==";
                    FullMovementPrediction.19490710[1] = "yenR5nMTHPsWIdUopyx5pp4kVyuE9OVFoBHVsWxmIEoD+dvFO261a9mHU1qMQ0rf";
                    continue block7;
                }
                case 2: {
                    FullMovementPrediction.19490710[0] = "QE2Kia1pYh9klD5Bx+z49g==";
                    continue block7;
                }
                case 4: {
                    FullMovementPrediction.19490710[0] = "UQ4oFBNVoiw=";
                }
            }
        }
    }

    public static Object -333871381(MethodHandles.Lookup lookup, String string, MethodType methodType, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) throws Exception {
        int n = (Integer)object;
        n = (n ^ 2147331589) & 0xFF;
        object5 = 436909345;
        object7 = Class.forName((String)new String(DatatypeConverter.parseBase64Binary((String)((String)object2))));
        MethodType methodType2 = MethodType.fromMethodDescriptorString((String)((String)object4), (ClassLoader)object7.getClassLoader());
        if (n == (Integer)object5) {
            return new MutableCallSite(lookup.findStatic((Class)object7, new String(DatatypeConverter.parseBase64Binary((String)((String)object3))), methodType2).asType(methodType));
        }
        return new MutableCallSite(lookup.findVirtual((Class)object7, new String(DatatypeConverter.parseBase64Binary((String)((String)object3))), methodType2).asType(methodType));
    }
}
