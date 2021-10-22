package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * Generic interface
 */
public interface MyQueue<E> {
    /**
     * Add an element at the end of the queue
     * @param x elemen to add in the queue
     */
    void enqueue(E x);

    /**
     * Remove the first item from the queue
     * @return E the first element of the queue
     */
    E dequeue();

    /**
     * Check if the queue is empty
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
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
