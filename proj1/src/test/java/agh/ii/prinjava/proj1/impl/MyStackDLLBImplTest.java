package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
        stackOfInts.push(2);
        stackOfInts.push(3);
        stackOfInts.push(4);
    }

    @AfterEach
    void tearDown() {    }


    /**
     * Remove the first item of the stack
     */
    @Test
    void pop(){
        stackOfInts.pop();
        assertEquals(3, stackOfInts.pop());
    }

    /**
     * Add an element on top of the stack
     */
    @Test
    void push(){
        stackOfInts.push(2);
        assertEquals(2, stackOfInts.peek(1));
    }

    /**
     * Count the elements in the stack
     */
    @Test
    void numOfElems(){
        stackOfInts.numOfElems();
        assertEquals(3, stackOfInts.numOfElems());
    }

    /**
     * Check the value of an element
     */
    @Test
    void peek(){
        assertEquals(2, stackOfInts.peek(3));
    }
}