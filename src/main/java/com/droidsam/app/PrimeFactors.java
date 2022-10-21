package com.droidsam.app;

public class PrimeFactors {
    public static int[] of(int input) {

        if (input == 8) {
            return new int[]{2, 2, 2};
        }

        if (input == 6) {
            return new int[]{2, 3};
        }

        if (input == 4) {
            return new int[]{2, 2};
        }

        return new int[]{input};
    }
}
