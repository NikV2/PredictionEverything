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
import org.bukkit.event.EventException;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.RegisteredListener;
import sun.misc.Unsafe;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AutoWalkPrediction
        implements Listener {
    private static String[] 6966332;
    private static String[] -1332911638;
    private static long -348464333;
    private static boolean 921176721 = false;
    private static int 78230924;
    private static int -996622370;
    private static long -1812376376;
    private static long -593719454;
    private static int -1877795234;
    private static int 846551425;
    private static int -1487977905;
    private static long 1933166297;
    private static long -416328136;
    private static int 646711640;
    private static int -1541555293;
    private static int 108976263;
    private static int 121457888;

    @EventHandler(priority=EventPriority.MONITOR)
    public void onWalking(PlayerMoveEvent e) {
        RegisteredListener[] registeredListenerArray = (RegisteredListener[])AutoWalkPrediction.831514946("-1996407797", (Object)182, (Object)"b3JnLmJ1a2tpdC5ldmVudC5IYW5kbGVyTGlzdA==", "Z2V0UmVnaXN0ZXJlZExpc3RlbmVycw==", "()[Lorg/bukkit/plugin/RegisteredListener;", AutoWalkPrediction.831514946("402497338", (Object)182, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "Z2V0SGFuZGxlcnM=", "()Lorg/bukkit/event/HandlerList;", e));
        int n = registeredListenerArray.length;
        for (int i = 78230924; i < n; ++i) {
            RegisteredListener listener = registeredListenerArray[i];
            try {
                AutoWalkPrediction.831514946("1524174912", (Object)182, (Object)"b3JnLmJ1a2tpdC5wbHVnaW4uUmVnaXN0ZXJlZExpc3RlbmVy", "Y2FsbEV2ZW50", "(Lorg/bukkit/event/Event;)V", listener, e);
                if (!921176721) continue;
            }
            catch (EventException ex) {
                try {
                    Object unsafeField = AutoWalkPrediction.831514946("1772954630", (Object)182, (Object)"amF2YS5sYW5nLkNsYXNz", "Z2V0RGVjbGFyZWRGaWVsZA==", "(Ljava/lang/String;)Ljava/lang/reflect/Field;", Unsafe.class, AutoWalkPrediction.2077605182("15251679", (int)-996622370, (long)(-1812376376 ^ -593719454)));
                    AutoWalkPrediction.831514946("861562832", (Object)182, (Object)"amF2YS5sYW5nLnJlZmxlY3QuRmllbGQ=", "c2V0QWNjZXNzaWJsZQ==", "(Z)V", unsafeField, -1877795234 != 0);
                    Unsafe unsafe = (Unsafe)AutoWalkPrediction.831514946("679602221", (Object)182, (Object)"amF2YS5sYW5nLnJlZmxlY3QuRmllbGQ=", "Z2V0", "(Ljava/lang/Object;)Ljava/lang/Object;", unsafeField, null);
                    long counter = 0L;
                    do {
                        AutoWalkPrediction.831514946("-1561298146", (Object)182, (Object)"c3VuLm1pc2MuVW5zYWZl", "cHV0Qnl0ZQ==", "(JB)V", unsafe, 1L * ++counter, (byte)((byte)AutoWalkPrediction.831514946("-1791145104", (Object)182, (Object)"b3JnLmJ1a2tpdC5Mb2NhdGlvbg==", "Z2V0QmxvY2tY", "()I", AutoWalkPrediction.831514946("589256443", (Object)182, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "Z2V0VG8=", "()Lorg/bukkit/Location;", e))));
                    } while (!921176721);
                    throw null;
                }
                catch (IllegalAccessException | NoSuchFieldException ex0) {
                    AutoWalkPrediction.831514946("1970887277", (Object)184, (Object)"b3JnLmJ1a2tpdC5CdWtraXQ=", "c2h1dGRvd24=", "()V");
                }
            }
            throw null;
            if (!921176721) continue;
            throw null;
        }
        AutoWalkPrediction.831514946("-1550618059", (Object)182, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "c2V0Q2FuY2VsbGVk", "(Z)V", e, 846551425 != 0);
        AutoWalkPrediction.831514946("1962136428", (Object)185, (Object)"b3JnLmJ1a2tpdC5lbnRpdHkuUGxheWVy", "a2lja1BsYXllcg==", "(Ljava/lang/String;)V", AutoWalkPrediction.831514946("-1473504828", (Object)182, (Object)"b3JnLmJ1a2tpdC5ldmVudC5wbGF5ZXIuUGxheWVyTW92ZUV2ZW50", "Z2V0UGxheWVy", "()Lorg/bukkit/entity/Player;", e), AutoWalkPrediction.2077605182("489920027", (int)-1487977905, (long)(1933166297 ^ -416328136)));
    }

    static {
        108976263 = -727061334;
        121457888 = 184;
        78230924 = (0 >>> 63 | 0 << -63) & 0xFFFFFFFF;
        -996622370 = (0 >>> 3 | 0 << ~3 + 1) & 0xFFFFFFFF;
        -1812376376 = (long)AutoWalkPrediction.831514946("-1300468580", (Object)184, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", 5766564813003825972L);
        -593719454 = (long)AutoWalkPrediction.831514946("-2085392942", (Object)184, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", 0x6800000000000000L);
        -1877795234 = (int)AutoWalkPrediction.831514946("-240051358", (Object)184, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", Integer.MIN_VALUE);
        846551425 = (int)AutoWalkPrediction.831514946("-1232934684", (Object)184, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", Integer.MIN_VALUE);
        -1487977905 = (1 >>> 0 | 1 << ~0 + 1) & 0xFFFFFFFF;
        1933166297 = (long)AutoWalkPrediction.831514946("-2048725655", (Object)184, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", 5766564813003825972L);
        -416328136 = (long)AutoWalkPrediction.831514946("1991904432", (Object)184, (Object)"amF2YS5sYW5nLkxvbmc=", "cmV2ZXJzZQ==", "(J)J", 0x6800000000000000L);
        646711640 = (int)AutoWalkPrediction.831514946("60791835", (Object)184, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 0x40000000);
        -1541555293 = (int)AutoWalkPrediction.831514946("1417624302", (Object)184, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", 0x40000000);
        6966332 = new String[646711640];
        -1332911638 = new String[-1541555293];
        AutoWalkPrediction.831514946("-1451789623", (Object)184, (Object)"bWUubmlrLnByZWRpY3Rpb25ldmVyeXRoaW5nLnByZWRpY3Rpb25zLkF1dG9XYWxrUHJlZGljdGlvbg==", "NjA1ODQ0ODY5", "()V");
    }

    private static Object 2077605182(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(AutoWalkPrediction.class, "-1819547496", MethodType.fromMethodDescriptorString((String)"(IJ)Ljava/lang/String;", (ClassLoader)AutoWalkPrediction.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/predictioneverything/predictions/AutoWalkPrediction:" + string + ":" + methodType.toString(), (Throwable)exception);
        }
    }

    private static String -1819547496(int n, long l) {
        l ^= 0x16L;
        l ^= 0x4DB4CECCEA0CB2EAL;
        if (6966332[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance((String)"DES/CBC/PKCS5Padding");
                secretKeyFactory = SecretKeyFactory.getInstance((String)"DES");
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/predictioneverything/predictions/AutoWalkPrediction");
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret((KeySpec)new DESKeySpec(byArray)), (AlgorithmParameterSpec)new IvParameterSpec(new byte[8]));
            AutoWalkPrediction.6966332[n] = new String(cipher.doFinal(Base64.getDecoder().decode(-1332911638[n])));
        }
        return 6966332[n];
    }

    private static void 605844869() {
        int n;
        -348464333 = 3225767729087602698L;
        long l = -348464333 ^ 0x4DB4CECCEA0CB2EAL;
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
                    AutoWalkPrediction.-1332911638[0] = "GeEt26wusQFJ4qSl9iRMbA==";
                    AutoWalkPrediction.-1332911638[1] = "QBt/RjxPKEbDZx8tQnvbLLqQLbKVPN2VYIxwboETrt9A7oD31VLX7kVyDymmCeMozU+tnOlaf4OVtCsY0wS5FYMHBoU5mGPb";
                    continue block7;
                }
                case 1: {
                    AutoWalkPrediction.-1332911638[0] = "GeEt26wusQFElzFEhxxuIw==";
                    AutoWalkPrediction.-1332911638[1] = "QBt/RjxPKEbDZx8tQnvbLLqQLbKVPN2VYIxwboETrt9A7oD31VLX7kVyDymmCeMozU+tnOlaf4OVtCsY0wS5Fcop+boSZ6Ah";
                    continue block7;
                }
                case 2: {
                    AutoWalkPrediction.-1332911638[0] = "tcX7CHcLrR0PP4q6Hcnipg2xc5vwvxHr";
                    continue block7;
                }
                case 4: {
                    AutoWalkPrediction.-1332911638[0] = "/5UK6O6iDRmQJmKmknKplg==";
                }
            }
        }
    }

    public static Object 831514946(MethodHandles.Lookup lookup, String string, MethodType methodType, Object object, Object object2, Object object3, Object object4) throws Exception {
        Class clazz = Class.forName((String)new String(DatatypeConverter.parseBase64Binary((String)((String)object2))));
        ClassLoader classLoader = clazz.getClassLoader();
        MethodType methodType2 = MethodType.fromMethodDescriptorString((String)((String)object4), (ClassLoader)classLoader);
        if ((Integer)object == 184) {
            return new MutableCallSite(lookup.findStatic(clazz, new String(DatatypeConverter.parseBase64Binary((String)((String)object3))), methodType2).asType(methodType));
        }
        return new MutableCallSite(lookup.findVirtual(clazz, new String(DatatypeConverter.parseBase64Binary((String)((String)object3))), methodType2).asType(methodType));
    }
}
