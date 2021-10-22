package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest<E> {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        dLinkList.addLast(4);
    }

    @AfterEach
    void tearDown() {    }


    /**
     * Add the element in parameter in the first position of the linked list
     * Test shows that position N°1 is the given number
     */
    @Test
    void addFirst(){
        dLinkList.addFirst(1);
        assertEquals(1, dLinkList.position(1));
    }

    /**
     * Add the element in parameter in the last position of the linked list
     */
    @Test
    void addLast(){
        dLinkList.addLast(5);
        assertEquals(5, dLinkList.position(4));
    }

    /**
     * Remove the first element from the linked list
     */
    @Test
    void removeFirst(){
        assertEquals(2, dLinkList.removeFirst());
        assertEquals(3, dLinkList.position(1));
    }

    /**
     * Remove the last element from the linked list
     */
    @Test
    void removeLast(){
        assertEquals(4, dLinkList.removeLast());
        assertEquals(3, dLinkList.position(2));
    }
}