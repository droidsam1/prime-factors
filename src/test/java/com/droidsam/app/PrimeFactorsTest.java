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
                Arguments.of(5, new int[]{5})
        );
    }

    @ParameterizedTest
    @MethodSource("getPrimeFactorsResultsPairs")
    public void shouldReturnAnArrayContainingOneWhenInputIsOne(int input, int[] expected) {
        Assertions.assertArrayEquals(expected, PrimeFactors.of(input));
    }
}
