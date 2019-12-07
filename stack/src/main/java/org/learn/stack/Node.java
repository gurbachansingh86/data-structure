package org.learn.stack;

/**
 *
 */
public class Node {
    /**
     */
    private int data;

    /**
     */
    private Node pointer;

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     */
    private Node prev;

    /**
     */
    public int getData() {
        return data;
    }

    /**
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     */
    public Node getPointer() {
        return pointer;
    }

    /**
     */
    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }
}