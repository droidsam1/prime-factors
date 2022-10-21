package com.droidsam.app;

public class PrimeFactors {
    public static int[] of(int input) {

        int[] result = new int[0];

        if (input == 1) {
            return new int[]{1};
        }

        for (int primeCandidate = 2; primeCandidate <= input; primeCandidate++) {
            while (input >= primeCandidate && input % primeCandidate == 0) {
                input = input / primeCandidate;
                result = join(result, new int[]{primeCandidate});
            }
        }
        return result;

    }

    private static int[] join(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}
