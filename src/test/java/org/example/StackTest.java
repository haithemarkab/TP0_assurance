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
    void push_must_add_element_to_theTop_in_stack() {

        stack.push(1919);
        assertEquals(1,stack.size());
        assertEquals(1919,stack.peek());
    }
    @Test
    void push_must_array_if_stack_Full(){

        for(int i=0;i<5;i++) {
            stack.push(i*4);
        }

        assertEquals(5,stack.size());
        stack.push(1616);
        assertEquals(6,stack.size());
        assertEquals(1616,stack.peek());
    }
    @Test
    void pop_must_return_the_element_the_top_is_not_empty() {

        stack.push(70);
        assertEquals(70,stack.pop());
        assertEquals(0,stack.size());


    }
    @Test
    void pop_must_raise_exception_if_stack_is_empty(){

        assertThrows(IllegalStateException.class,() -> stack.pop());

    }
    @Test
    void peek_must_return_element_the_top_if_stack_est_not_epmty() {

        stack.push(190);
        assertEquals(190,stack.peek());
    }
    @Test
    void peek_must_raise_exception_if_stack_is_empty(){

        assertThrows(IllegalStateException.class,() ->stack.peek());

    }
    @Test
    void is_empty_must_rrturn_true_if_is_empty() {

        assertTrue(stack.isEmpty());

    }
    @Test
    void is_empty_must_return_false_if_is_not_empty() {

        stack.push(100);
        assertFalse(stack.isEmpty());
    }

    @Test
    void size_must_return_size_of_Stack() {

        stack.push(32);
        assertEquals(1,stack.size());
    }
}