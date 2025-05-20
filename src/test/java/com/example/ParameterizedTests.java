package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTests {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testGetKittenWithParameter(int expectedKitten) {
        Feline feline = new Feline();
        int kittens = feline.getKittens(expectedKitten);
        assertEquals(expectedKitten, kittens, "Количество котят должно быть " + expectedKitten);
    }
}
