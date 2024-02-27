package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// *****************test de Fibonacci*******************
class FibonacciTest {
    @Test
    void fibonacciShouldRaiseExceptionIfNumberIsNegative() {

        assertThrows(IllegalArgumentException.class,()-> Fibonacci.fibonacci(-7));
    }
    @Test
    void fibonacciShouldReturnZeroIfNumberIsZero(){

        assertEquals(0,Fibonacci.fibonacci(0));
    }
    @Test
    void fibonacciShouldReturnOneIfNumberIsOne(){

        assertEquals(1,Fibonacci.fibonacci(1));
    }
    @Test
    void fibonacciShouldReturnTheRightResultIfNumberIsNotNegativeAndIsGreaterThanOne(){

        assertEquals(5,Fibonacci.fibonacci(5));
    }

}