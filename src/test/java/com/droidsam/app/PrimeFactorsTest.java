package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {

    @Test
    public void shouldReturnAnArrayContainingOneWhenInputIsOne(){
        int input = 1;
        int [] expectedResult = {1};

        Assertions.assertArrayEquals(expectedResult, PrimeFactors.of(input));
    }

    @Test
    public void shouldReturnAnArrayContainingTwoWhenInputIsTwo(){
        int input = 2;
        int [] expectedResult = {2};

        Assertions.assertArrayEquals(expectedResult, PrimeFactors.of(input));
    }
}
