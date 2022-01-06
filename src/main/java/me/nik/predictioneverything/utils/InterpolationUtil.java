package me.nik.predictioneverything.utils;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import javax.xml.bind.DatatypeConverter;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class InterpolationUtil {
    private static int 1724054773 = 1131241723;
    private static boolean -54795370 = true;
    private static int -2012518758;
    private static int -1883856469;
    private static int 388823541;
    private static int -1359316740;
    private static int -1398007603;
    private static int 1360790884;

    private InterpolationUtil() {
    }

    public static <T> boolean bruteForceInterpolation(T t) {
        Object object;
        if (InterpolationUtil.-577827111("-1898878250", (Object)734432265, (Object)"amF2YS5sYW5nLkNsYXNz", "aXNBbm5vdGF0aW9uUHJlc2VudA==", "(Ljava/lang/Class;)Z", 11, -1860268657, InterpolationUtil.-577827111("801552606", (Object)734432265, (Object)"amF2YS5sYW5nLk9iamVjdA==", "Z2V0Q2xhc3M=", "()Ljava/lang/Class;", 2.1574755861578376, 5.1791103563162455, t), null) != false) {
            object = InterpolationUtil.-577827111("-1237753681", (Object)734432265, (Object)"amF2YS5sYW5nLk9iamVjdA==", "ZXF1YWxz", "(Ljava/lang/Object;)Z", -2185275198287044688L, 30, t, InterpolationUtil.-577827111("16274656", (Object)734432263, (Object)"amF2YS5sYW5nLlN0cmluZw==", "dmFsdWVPZg==", "([C)Ljava/lang/String;", 0.5135664f, "2012732761", null));
            if (!-54795370) {
                throw null;
            }
        } else if (InterpolationUtil.-577827111("-1650467293", (Object)734432265, (Object)"amF2YS5sYW5nLk9iamVjdA==", "aGFzaENvZGU=", "()I", 0.9844686f, -7261801256205500475L, t) >> -2012518758 < -1883856469) {
            object = 388823541;
            if (1724054773 < 0) {
                throw null;
            }
        } else {
            object = -1359316740;
        }
        return (boolean)object;
    }

    static {
        -1398007603 = 734432447;
        1360790884 = 184;
        -2012518758 = (int)InterpolationUtil.-577827111("-1495695562", (Object)734432263, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", -2601936751110109921L, 4.209080389613408, -2);
        -1883856469 = 5 >>> 254 | 5 << ~254 + 1;
        388823541 = 65536 >>> 48 | 65536 << -48;
        -1359316740 = (int)InterpolationUtil.-577827111("-403444712", (Object)734432263, (Object)"amF2YS5sYW5nLkludGVnZXI=", "cmV2ZXJzZQ==", "(I)I", -7865976657098823693L, "\"\"+3\u001c$'\u0011'. \u001b6#", 0);
    }

    public static Object -577827111(MethodHandles.Lookup lookup, String string, MethodType methodType, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) throws Exception {
        int n = (Integer)object;
        n = (n ^ -1398007603) & 0xFF;
        object5 = 1360790884;
        Class clazz = Class.forName((String)new String(DatatypeConverter.parseBase64Binary((String)((String)object2))));
        MethodType methodType2 = MethodType.fromMethodDescriptorString((String)((String)object4), (ClassLoader)clazz.getClassLoader());
        if (n == (Integer)object5) {
            return new MutableCallSite(lookup.findStatic(clazz, new String(DatatypeConverter.parseBase64Binary((String)((String)object3))), methodType2).asType(methodType));
        }
        return new MutableCallSite(lookup.findVirtual(clazz, new String(DatatypeConverter.parseBase64Binary((String)((String)object3))), methodType2).asType(methodType));
    }
}
