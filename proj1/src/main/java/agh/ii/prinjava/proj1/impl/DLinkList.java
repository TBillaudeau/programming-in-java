package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> head = null;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        /**
         * Create a node with element as value
         * @param elem an element to add to a node
         */
        private Node(T elem) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    @Override
    public String toString() {
        Node<E> temp = head;
        StringBuilder result = new StringBuilder();

        while (temp.next != null)
            result.append(temp);
            temp = temp.next;

        return result.toString();
    }

    /***
     * Add an element in the first position of the list
     * @param elem any given element
     */
    public void addFirst(E elem){
        Node<E> addNode = new Node<>(elem);
        if (head == null) {
            this.head = addNode;
        } else if (head != null) {
            Node<E> temp = head;
            head = addNode;
            addNode.next = temp;
            temp.prev = head;
        }
    }

    /***
     * Add an element to the end of the list
     * @param elem any given element
     */
    public void addLast(E elem) {
        Node<E> addNode = new Node<>(elem);
        if (head == null) {
            this.head = addNode;
        } else if (head != null) {
            Node<E> temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = addNode;
            addNode.prev = temp;
        }
    }

    /***
     * Remove the first element of the list
     * @return Value of the element E
     */
    public E removeFirst() {
        E returnValue =  null;
        if (head != null){
            returnValue = head.elem;
            head = head.next;
        }
        return returnValue;
    }

    /***
     * Remove the last element of the list
     * @return Value of the element E
     */
    public E removeLast() {
        E returnValue = null;
        if (head != null) {
            if (head.next == null) {
                returnValue = head.elem;
                head = null;
            } else {
                Node<E> last = head;
                while (last.next.next != null) {
                    last = last.next;
                }
                returnValue = last.next.elem;
                last.next = null;
            }
        }
        return returnValue;
    }

    /**
     * Check the value of an element
     * @return E element of position i
     * @param i int position
     */
    public E position(int i) {
        Node<E> temp = head;
        int count = 1;
        while (temp != null) {
            if (count == i)
                return temp.elem;
            count++;
            temp = temp.next;
        }
        return null;
    }

    /**
     * Compute the number of elements in the list
     * @return int lenght the light of the list
     */
    public int listLength(){
        int length = 0;
        if (head != null){
            Node<E> temp = head;
            length++;
            while (temp.next != null){
                length++;
                temp = temp.next;
            }
        }
        return length;
    }
}