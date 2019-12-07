package org.learn.stack;

public class StackWithLinkedList {
    /**
     */
    private Node top;

    /**
     */
    private Node start;

    /**
     */
    private int size = 0;

    /**
     */
    public void push( int val) {
        Node nd = new Node();
        nd.setData(val);
        if (start == null) {
             top = start = nd;
        } else {
            nd.setPointer(top);
            top.setPrev(nd);
            top = nd;
        }
        System.out.println("Value " + top.getData() + " has been pushed  into stack");
    }

    /**
     *
     */
    public void pop() {
        if (top == null) {
            start = null;
            System.out.println("Stack is empty");
        } else {
            System.out.println("Value " + top.getData() + " has been pop  from the stack");
            top = top.getPointer();
            if (top != null) {
                top.setPrev(null);
            } else {
                start = null;
            }
        }
    }

    public void printStack() {
        Node traverse = start;
        if (traverse == null) {
            System.out.println("Stack is empty");
        }
        while ( traverse != null) {
            System.out.println("Value : " + traverse.getData());
            traverse = traverse.getPrev();
       }
    }

    public void printTop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top values : " + top.getData());
        }
    }
}