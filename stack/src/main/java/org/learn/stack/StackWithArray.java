package org.learn.stack;

/**
 * Stack is data structure in which we can store data or object in such way that we pop last element and push in the top
 */

/**
 *
 * ############################################################################
 *
 *  #############
 *  #	4		#
 *	#############
 *	#	3		#
 * 	#############
 * 	#	2		#
 * 	#############
 * 	#	1		#
 * 	#############
 *
 * 	Array (0=>1, 1=>2, 2=> 3, 3=>4)
 * 	1 -> push at 0
 * 	2 -> push at 1
 * 	3 -> push at 2
 * 	4 -> push at 3
 */
public class StackWithArray {
    /**
     */
    private int size;

    /**
     */
    private int counter = -1;

    /**
     */
    private int[] stackArr;

    public StackWithArray(int size) {
        this.size = size;
        stackArr = new int[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    /**
     *
     */
    public void push(int val) {
        if (stackArr.length  == 0 ) {
            System.out.println("Stack is empty");
        } else if ( getCounter() == (getSize() -1) ) {
            System.out.println("Limit " + getSize() + " has been reached");
            return;
        }
        int pointer = getCounter() + 1;
        stackArr[pointer] = val;
        setCounter(pointer);
        System.out.println("Value " + val + " has been pushed  into stack");
        return;
    }

    /**
     *
     */
    public void pop() {
        if (getCounter() == -1) {
            System.out.println("Stack is empty");
            return;
        }
        int val = stackArr[counter];
        stackArr[counter] = 0;
        counter = counter - 1;
        System.out.println("Value " + val + " has been pop  from the stack");
    }

    public int getCount() {
        return stackArr.length;
    }

    public void printStack() {
        if (counter == -1) {System.out.println("Stack is empty"); return;}
        for (int i = 0; i <= counter; i++) {
            System.out.println("Value : " + stackArr[i]);
        }
    }
}
