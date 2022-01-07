package me.nik.predictioneverything.utils;

import com.google.common.collect.Lists;

import java.util.function.Function;

public final class ThreadUtil {

    private ThreadUtil(){}

    public static <T> void runAsync(Function<T, Boolean> function) {
        final boolean machAync = true;
        while (machAync) {
                    Lists.newCopyOnWriteArrayList().stream().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .forEach(value -> {
                    return;
                });
        }
    }
}
