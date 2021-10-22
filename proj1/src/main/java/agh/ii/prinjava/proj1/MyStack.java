package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 * Generic interface
 */
public interface MyStack<E> {
    /**
     * Remove the first item of the stack
     * @return E the Elem on top of the stack
     */
    E pop();

    /**
     * Add an element on top of the stack
     * @param x E elem which will be put in the stack
     */
    void push(E x);

    /**
     * Check if the stack is empty
     * @return True/False
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Count the elements in the stack
     * @return int number of elements in the stack
     */
    int numOfElems();

    /**
     * Check the value of an element
     * @return E element of position i
     * @param i int position
     */
    E peek(int i);

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
