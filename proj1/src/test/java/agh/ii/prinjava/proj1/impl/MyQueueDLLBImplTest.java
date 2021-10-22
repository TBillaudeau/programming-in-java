package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        queueOfInts.enqueue(4);
    }

    @AfterEach
    void tearDown() {    }


    /**
     * Add an element at the end of the queue
     */
    @Test
    void enqueue(){
        queueOfInts.enqueue(1);
        assertEquals(1, queueOfInts.peek(4));
    }

    /**
     * Remove the first item from the queue
     */
    @Test
    void dequeue(){
        queueOfInts.dequeue();
        assertEquals(3, queueOfInts.peek(1));
    }

    /**
     * Count the elements in the queue
     */
    @Test
    void numOfElems(){
        queueOfInts.numOfElems();
        assertEquals(3, queueOfInts.numOfElems());
    }

    /**
     * Check the value of an element
     */
    @Test
    void peek(){
        assertEquals(3, queueOfInts.peek(2));
    }
}