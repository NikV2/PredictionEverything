package me.nik.predictioneverything.custom;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import javax.xml.bind.DatatypeConverter;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class PredictionException
        extends RuntimeException {
    private static int -2043196314 = 1679771816;
    private static int -220961735 = 184;

    public PredictionException(String error) {
        PredictionException.-1761921198("2056311814", (Object)1679771664, (Object)"amF2YS5sYW5nLlN5c3RlbQ==", "ZXhpdA==", "(I)V", "\u0016\u000b\u0001\u0005!3\u0001\u001b\u0004\u0005&\u0016\u001b\u00124 .\u0013\"$.\n", (int)PredictionException.-1761921198("-434027950", (Object)1679771678, (Object)"amF2YS5sYW5nLlN0cmluZw==", "bGVuZ3Ro", "()I", "LTE4Mzc0NDQxNjk=", error));
    }

    public static Object -1761921198(MethodHandles.Lookup lookup, String string, MethodType methodType, Object object, Object object2, Object object3, Object object4, Object object5) throws Exception {
        int n = (Integer)object;
        n = (n ^ -2043196314) & 0xFF;
        object5 = -220961735;
        Class clazz = Class.forName((String)new String(DatatypeConverter.parseBase64Binary((String)((String)object2))));
        MethodType methodType2 = MethodType.fromMethodDescriptorString((String)((String)object4), (ClassLoader)clazz.getClassLoader());
        if (n == (Integer)object5) {
            return new MutableCallSite(lookup.findStatic(clazz, new String(DatatypeConverter.parseBase64Binary((String)((String)object3))), methodType2).asType(methodType));
        }
        return new MutableCallSite(lookup.findVirtual(clazz, new String(DatatypeConverter.parseBase64Binary((String)((String)object3))), methodType2).asType(methodType));
    }
}
