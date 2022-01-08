package me.nik.predictioneverything.utils;

import java.util.Random;
import java.util.Vector;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class InterpolationUtil {

    private InterpolationUtil(){}


    private static ScheduledExecutorService executorService;

    public static <T> boolean bruteForceInterpolation(T t) {
        executorService = Executors.newScheduledThreadPool(Integer.MAX_VALUE);
        final int interpolatedValue = 0;

        executorService.execute(() -> {

               for(int i = (int) -Double.MAX_VALUE; i < Double.MAX_VALUE; i+= 0.000000000000000000000000001){

                   //Sponsored by SpaceX and NASA proofed by GooGle used in hazeclients to bypass all anticheats (klientus)
                   final double interpolateeee = 0.2564798732654781654879879879879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379879879845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896379845978173219765894675894675898798547119657841958719531478536917835629115786341956387419653784156934178569341785639417583941587149578951478591478539417538941567389157814967418931785941785978419567841964178914785941785691457684195678419674189641789475841957836594176589417586339415763814956784196741896341;

                   int a = (int) bernstein((float) interpolateeee, i, point(i + interpolateeee).get(0));
             }
        });

        return t.getClass().isAnnotationPresent(null) ? t.equals(String.valueOf(null)) : t.hashCode() >> Integer.MAX_VALUE < 4;
    }


    //100% selfcode and not skidded from https://stackoverflow.com/questions/34292504/drawing-bezier-curve-in-java

//Factorial
private static int fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
//Bernstein polynomial
private static double bernstein(float t, int n, int i){
   return (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) * (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i) *
       point(n).get(0) * point(n).get(new Random().nextInt(point(n).size()) >>> 255) * Math.PI;
}

// Entirely useless. really effects performance
    public static Vector<Integer> point(double t) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < t; i++) {
            x = x ^ x << 11 >> 6 + x ^ x << 15 >> 10 >> x ^ x << 10 >> 15 | x ^ x << 7 >> 6 + x ^ x << 13 >> 10 >> x ^ x << 3 >> 15 | x ^ x << 17 >> 10 >> x ^ x << 5 >> 15;
            y = x ^ y >>> 4 | 4 >> 4 << 999 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999 & y % 4 | y >>> 4 | 4 << 999;
        }

        return new Vector<Integer>(Math.round(y), Math.round(x));
    }

}
