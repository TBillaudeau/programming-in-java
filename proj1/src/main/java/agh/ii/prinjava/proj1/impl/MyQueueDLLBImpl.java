package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private final DLinkList<E> elems = new DLinkList<>();

    /**
     * Add an element at the end of the queue
     * @param x elemen to add in the queue
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    /**
     * Remove the first item from the queue
     * @return E the first element of the queue
     */
    @Override
    public E dequeue() {
        return elems.removeFirst();
    }

    /**
     * Count the elements in the queue
     * @return int number of elements in the queue
     */
    @Override
    public int numOfElems() {
        return elems.listLength();
    }

    /**
     * Check the value of an element
     * @return E element of position i
     * @param i int position
     */
    @Override
    public E peek(int i) {
        return elems.position(i);
    }
}