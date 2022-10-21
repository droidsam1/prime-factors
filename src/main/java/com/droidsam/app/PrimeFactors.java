package com.droidsam.app;

public class PrimeFactors {
    public static int[] of(int input) {

        if (input % 2 == 0 && input > 2) {
            return join(new int[]{2}, of(input / 2));
        }

        if (input % 3 == 0 && input > 3) {
            return join(new int[]{3}, of(input / 3));
        }
        if (input % 7 == 0 && input > 7) {
            return join(new int[]{7}, of(input / 7));
        }

        return new int[]{input};
    }

    private static int[] join(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}
