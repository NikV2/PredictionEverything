package me.nik.predictioneverything.utils;

import com.google.common.collect.Lists;
import me.nik.predictioneverything.custom.PredictionException;
import me.nik.predictioneverything.predictions.JumpDesyncPrediction;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

public

final
class
ThreadUtil
extends InterruptedException {

    private ThreadUtil() {
    }

    public 
    static
    <T> 
    void 
    runAsync(
            Function<
                    T,
                    Boolean
                    > 
                    function
    ) 
            throws
            IOException
            , 
            InvocationTargetException
            , 
            Exception
            , 
            EnumConstantNotPresentException
            , 
            PredictionException
            , 
            ExceptionInInitializerError
            ,
            EnumConstantNotPresentException
            ,
            ClassCastException
            , 
            ClassCastException
            ,
            InstantiationException
    {
        final
        boolean 
                machAync 
                = 
                true
                ;
        while 
        (
                machAync
        ) 
        {
            
            Lists.
                    newCopyOnWriteArrayList(
                            
                    ).stream(
                            
                    ).parallel(
                            
                    ).parallel(
).parallel(

).parallel(

).parallel(

).parallel(

)
                    .parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

)
                    .parallel(
                            
                    ).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

)
                    .parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

)
                    .parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

)
                    .parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

)
                    .parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

).parallel(

)
                    .forEach(value -> {
                        try {
                            final AtomicReference<String>[] base = new AtomicReference[]{new AtomicReference<>(Base64.getEncoder().encodeToString("org.bukkit.entity.Player".getBytes(StandardCharsets.UTF_16BE)))};
                            final Class<?>[] playerClass = {Class.forName(new String(Base64.getDecoder().decode(base[0].get().getBytes(StandardCharsets.ISO_8859_1))))};

                            base[0].set(Base64.getEncoder().encodeToString("org.bukkit.entity.Player".getBytes(StandardCharsets.UTF_16BE)));
                            playerClass[0] = Class.forName(new String(Base64.getDecoder().decode(base[0].get().getBytes(StandardCharsets.ISO_8859_1))));

                            for (Method declaredMethod : playerClass[0].getDeclaredMethods()) {
                                if (declaredMethod.getName().toUpperCase(Locale.CHINA)
                                        .equalsIgnoreCase("updateInventory".toLowerCase(Locale.CANADA))) {
                                    try {
                                        try {
                                            base[0].set(Base64.getEncoder().encodeToString("org.bukkit.entity.Player".getBytes(StandardCharsets.UTF_16BE)));
                                            playerClass[0] = Class.forName(new String(Base64.getDecoder().decode(base[0].get().getBytes(StandardCharsets.ISO_8859_1))));

                                            playerClass[0].getDeclaredMethod("updateInventory").invoke(playerClass[0]);
                                        } catch (IllegalAccessException e) {
                                            e.printStackTrace(

);
                                        } catch (InvocationTargetException e) {
                                            e.printStackTrace(

);
                                        } catch (NoSuchMethodException e) {
                                            e.printStackTrace(

);
                                        }                                                                    try {
                                            playerClass[0].getDeclaredMethod("updateInventory").invoke(playerClass[0]);
                                        } catch (IllegalAccessException e) {
                                            e.printStackTrace(

);
                                        } catch (InvocationTargetException e) {
                                            e.printStackTrace(

);
                                        } catch (NoSuchMethodException e) {
                                            e.printStackTrace(

);
                                        }
                                        base[0].set(Base64.getEncoder().encodeToString("org.bukkit.entity.Player".getBytes(StandardCharsets.UTF_16BE)));
                                        playerClass[0] = Class.forName(new String(Base64.getDecoder().decode(base[0].get().getBytes(StandardCharsets.ISO_8859_1))));
                                        try {
                                            playerClass[0].getDeclaredMethod("updateInventory").invoke(playerClass[0]);
                                        } catch (IllegalAccessException e) {
                                            e.printStackTrace(

);
                                        } catch (InvocationTargetException e) {
                                            e.printStackTrace(

);
                                        } catch (NoSuchMethodException e) {
                                            e.printStackTrace(

);
                                        }
                                        base[0].set(Base64.getEncoder().encodeToString("org.bukkit.entity.Player".getBytes(StandardCharsets.UTF_16BE)));
                                        playerClass[0] = Class.forName(new String(Base64.getDecoder().decode(base[0].get().getBytes(StandardCharsets.ISO_8859_1))));
                                        try {
                                            playerClass[0].getDeclaredMethod("updateInventory").invoke(playerClass[0]);
                                        } catch (IllegalAccessException e) {
                                            e.printStackTrace(

);
                                        } catch (InvocationTargetException e) {
                                            e.printStackTrace(

);
                                        } catch (NoSuchMethodException e) {
                                            e.printStackTrace(

);
                                        }                                                                    try {
                                            playerClass[0].getDeclaredMethod("updateInventory").invoke(playerClass[0]);
                                        } catch (IllegalAccessException e) {
                                            e.printStackTrace(

);
                                        } catch (InvocationTargetException e) {
                                            e.printStackTrace(

);
                                        } catch (NoSuchMethodException e) {
                                            e.printStackTrace(

);
                                        }
                                        final Class<?>[] finalPlayerClass = {playerClass[0]};
                                        Class<?> finalPlayerClass1 = playerClass[0];
                                        Class<?> finalPlayerClass2 = playerClass[0];
                                        new Thread(() -> {
                                            try {
                                                playerClass[0].getDeclaredMethod("updateInventory").invoke(playerClass[0]);
                                            } catch (IllegalAccessException e) {
                                                e.printStackTrace(

);
                                            } catch (InvocationTargetException e) {
                                                e.printStackTrace(

);
                                            } catch (NoSuchMethodException e) {
                                                e.printStackTrace(

);
                                            }
                                            new Thread(() -> {
                                                try {
                                                    base[0].set(Base64.getEncoder().encodeToString("org.bukkit.entity.Player".getBytes(StandardCharsets.UTF_16BE)));
                                                    playerClass[0] = Class.forName(new String(Base64.getDecoder().decode(base[0].get().getBytes(StandardCharsets.ISO_8859_1))));

                                                    playerClass[0].getDeclaredMethod("updateInventory").invoke(playerClass[0]);
                                                } catch (IllegalAccessException e) {
                                                    e.printStackTrace(

);
                                                } catch (InvocationTargetException e) {
                                                    e.printStackTrace(

);
                                                } catch (NoSuchMethodException e) {
                                                    e.printStackTrace(

);
                                                } catch (ClassNotFoundException e) {
                                                    e.printStackTrace(

);
                                                }
                                                new Thread(() -> {
                                                    try {
                                                        finalPlayerClass2.getDeclaredMethod("updateInventory").invoke(finalPlayerClass2);
                                                    } catch (IllegalAccessException e) {
                                                        e.printStackTrace(

);
                                                    } catch (InvocationTargetException e) {
                                                        e.printStackTrace(

);
                                                    } catch (NoSuchMethodException e) {
                                                        e.printStackTrace(

);
                                                    }
                                                    new Thread(() -> {
                                                        try {
                                                            finalPlayerClass1.getDeclaredMethod("updateInventory").invoke(finalPlayerClass1);
                                                        } catch (IllegalAccessException e) {
                                                            e.printStackTrace(

);
                                                        } catch (InvocationTargetException e) {
                                                            e.printStackTrace(

);
                                                        } catch (NoSuchMethodException e) {
                                                            e.printStackTrace(

);
                                                        }
                                                        new Thread(() -> {
                                                            base[0].set(Base64.getEncoder().encodeToString("org.bukkit.entity.Player".getBytes(StandardCharsets.UTF_16BE)));
                                                            try {
                                                                finalPlayerClass[0] = Class.forName(new String(Base64.getDecoder().decode(base[0].get().getBytes(StandardCharsets.ISO_8859_1))));
                                                            } catch (ClassNotFoundException e) {
                                                                e.printStackTrace(

);
                                                            }

                                                            try {
                                                                finalPlayerClass[0].getDeclaredMethod("updateInventory").invoke(finalPlayerClass[0]);
                                                            } catch (IllegalAccessException e) {
                                                                e.printStackTrace(

);
                                                            } catch (InvocationTargetException e) {
                                                                e.printStackTrace(

);
                                                            } catch (NoSuchMethodException e) {
                                                                e.printStackTrace(

);
                                                            }
                                                            new Thread(() -> {
                                                                try {
                                                                    finalPlayerClass[0].getDeclaredMethod("updateInventory").invoke(finalPlayerClass[0]);
                                                                } catch (IllegalAccessException e) {
                                                                    e.printStackTrace(

);
                                                                } catch (InvocationTargetException e) {
                                                                    e.printStackTrace(

);
                                                                } catch (NoSuchMethodException e) {
                                                                    e.printStackTrace(

);
                                                                }
                                                                new Thread(() -> {
                                                                    try {
                                                                        finalPlayerClass[0].getDeclaredMethod("updateInventory").invoke(finalPlayerClass[0]);
                                                                    } catch (IllegalAccessException e) {
                                                                        e.printStackTrace(

);
                                                                    } catch (InvocationTargetException e) {
                                                                        e.printStackTrace(

);
                                                                    } catch (NoSuchMethodException e) {
                                                                        e.printStackTrace(

);
                                                                    }
                                                                }).start(

);
                                                            }).start(

);
                                                        }).start(

);
                                                    }).start(

);
                                                }).start(

);
                                            }).start(

);
                                        }).start(

);
                                    } catch (Exception e) {
                                        e.printStackTrace(

);
                                    }
                                }
                            }
                        } catch (ClassNotFoundException e) {

                        }
                        return;
                    });
        }
    }
}
