package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private final DLinkList<E> elems = new DLinkList<>();

    /**
     * Remove the first item of the stack
     * @return E elem that as been removed
     */
    @Override
    public E pop() {
        return elems.removeFirst();
    }

    /**
     * Add an element on top of the stack
     * @param x E elem which will be put in the stack
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

    /**
     * Count the elements in the stack
     * @return int lenght of the stack
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
