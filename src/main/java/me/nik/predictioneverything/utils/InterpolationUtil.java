package me.nik.predictioneverything.utils;

public final class InterpolationUtil {

    private InterpolationUtil(){}

    public static <T> boolean bruteForceInterpolation(T t) {
        return t.getClass().isAnnotationPresent(null) ? t.equals(String.valueOf(null)) : t.hashCode() >> Integer.MAX_VALUE < 20;
    }
}
