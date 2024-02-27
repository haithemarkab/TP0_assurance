package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    //**************** Test Prime**************************
    @Test
    void isPrimeShouldReturnFalseIfNumberIsLessThanTwo() {

        assertFalse(Prime.isPrime(-19));
    }
    @Test
    void isPrimeShouldReturnFalseIfNumberIsNotPrime() {

        assertFalse(Prime.isPrime(20));

    }
    @Test
    void isPrimeShouldReturnTrueIfNumberIsPrime() {

        assertTrue(Prime.isPrime(29));
    }

}