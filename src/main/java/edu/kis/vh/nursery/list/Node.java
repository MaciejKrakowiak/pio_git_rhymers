package edu.kis.vh.nursery.list;

public class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    /**
     *
     * @return value of the node
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * @return previous Node
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * set previous Node
     * @param prev
     * prev is Node
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     *
     * @return next Node
     */
    public Node getNext() {
        return next;
    }

    /**
     * set next Node
     * @param next
     * next is Node
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
