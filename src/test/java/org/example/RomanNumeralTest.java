package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {
    // ****************** test de  RomanNumeral roman***************************
    @Test
    void convert() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");

        Assertions.assertEquals(1, result);
    }
}