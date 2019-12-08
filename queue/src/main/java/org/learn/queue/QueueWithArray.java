package org.learn.queue;

/**
 */
public class QueueWithArray {
    private int pointer=-1;
    private int size;
    private int[] queue;
    public QueueWithArray(int size) {
        this.size = size;
        queue = new int[size];
    }

    public void push(int data) {
        if (queue.length == 0) {
            System.out.println("Queue is not initialized");
        } else if (pointer == (size-1)) {
            System.out.println("Limit " + size + " has been reached");
        } else {
            pointer = pointer+1;
            queue[pointer]=data;
        }
    }

    public void pop() {

    }
    public void printQueue() {
        if (pointer == -1) {System.out.println("Queue is empty"); return;}
        for (int i = 0; i <= pointer; i++) {
            System.out.println("Value : " + queue[i]);
        }
    }

}