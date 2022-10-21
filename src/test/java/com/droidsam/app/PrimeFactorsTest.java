package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PrimeFactorsTest {

    public static Stream<Arguments> getPrimeFactorsResultsPairs() {
        return Stream.of(
                Arguments.of(1, new int[]{1}),
                Arguments.of(2, new int[]{2}),
                Arguments.of(3, new int[]{3}),
                Arguments.of(4, new int[]{2,2}),
                Arguments.of(5, new int[]{5}),
                Arguments.of(6, new int[]{2,3}),
                Arguments.of(7, new int[]{7}),
                Arguments.of(8, new int[]{2,2,2}),
                Arguments.of(9, new int[]{3,3}),
                Arguments.of(10, new int[]{2,5}),
                Arguments.of(11, new int[]{11}),
                Arguments.of(12, new int[]{2,2,3}),
                Arguments.of(13, new int[]{13}),
                Arguments.of(14, new int[]{2,7}),
                Arguments.of(15, new int[]{3,5}),
                Arguments.of(49, new int[]{7,7}),
                Arguments.of(60, new int[]{2,2,3,5}),
                Arguments.of(91, new int[]{7,13}),
                Arguments.of(121, new int[]{11,11}),
                Arguments.of(1911, new int[]{3,7,7,13})


        );
    }

    @ParameterizedTest
    @MethodSource("getPrimeFactorsResultsPairs")
    public void shouldReturnAnArrayContainingOneWhenInputIsOne(int input, int[] expected) {
        Assertions.assertArrayEquals(expected, PrimeFactors.of(input));
    }
}
