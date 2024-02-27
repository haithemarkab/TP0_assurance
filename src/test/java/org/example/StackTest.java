package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;
//******************************** test de Stack *****************************

class StackTest {


    private Stack stack;
    @BeforeEach
    void Setup(){
        stack = new Stack();
    }



    //**************************** tester la pile *************************************
    @Test
    void pushShouldAddElementToTheTopOfTheStack() {

        stack.push(1919);
        assertEquals(1,stack.size());
        assertEquals(1919,stack.peek());
    }
    @Test
    void pushShouldExpandArrayIfStackIsFull(){

        for(int i=0;i<5;i++) {
            stack.push(i*4);
        }

        assertEquals(5,stack.size());
        stack.push(1616);
        assertEquals(6,stack.size());
        assertEquals(1616,stack.peek());
    }
    @Test
    void popShouldReturnTheElementAtTheTopIfIsNotEmpty() {

        stack.push(70);
        assertEquals(70,stack.pop());
        assertEquals(0,stack.size());


    }
    @Test
    void popShouldRaiseExceptionIfStackIsEmpty(){

        assertThrows(IllegalStateException.class,() -> stack.pop());

    }
    @Test
    void peekShouldReturnElementAtTheTopIfStackIsNotEpmty() {

        stack.push(190);
        assertEquals(190,stack.peek());
    }
    @Test
    void peekShouldRaiseExceptionIfStackIsEmpty(){

        assertThrows(IllegalStateException.class,() ->stack.peek());

    }
    @Test
    void isEmptyShouldRrturnTrueIfItIsEmpty() {

        assertTrue(stack.isEmpty());

    }
    @Test
    void isEmptyShouldReturnFalseIfItIsNotEmpty() {

        stack.push(100);
        assertFalse(stack.isEmpty());
    }

    @Test
    void sizeShouldReturnSizeOfStack() {

        stack.push(32);
        assertEquals(1,stack.size());
    }
}