package org.learn.heap;

import java.util.stream.IntStream;

/**
 */
public class Heap {
    /**
     * Min-Heap: In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children.
     * The same property must be recursively true for all sub-trees in that Binary Tree.
     */
    public void isMaxHeap(int[] arr) {
        boolean isMaxHeap = true;

        if (arr.length == 0) {
            System.out.println("Tree is empty");
        }

        for (int i=0; i<arr.length;i++) {
            if (arr.length > i &&  arr.length > 2*i+1 &&  arr.length > 2*i+2 ) {
                System.out.println(" Root :" + i  + " left child : "  + (2*i+1) + " right child : " +  (2*i+2));
                if( !(arr[i] > arr[2*i+1] && arr[i] > arr[2*i+2]) ) {
                    isMaxHeap = false;
                    break;
                }
            }
        }

        if (isMaxHeap) {
            System.out.println("Max heap data structure");
        } else {
            System.out.println("Not max heap data structure");
        }
    }

    /**
     * Min-Heap: In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children.
     * The same property must be recursively true for all sub-trees in that Binary Tree.
     */
    public void isMinHeap(int[] arr) {
        boolean isMinHeap = true;

        if (arr.length == 0) {
            System.out.println("Tree is empty");
        }

        for (int i=0; i<arr.length;i++) {
            if (arr.length > i &&  arr.length > 2*i+1 &&  arr.length > 2*i+2 ) {
                System.out.println(" Root :" + i  + " left child : "  + (2*i+1) + " right child : " +  (2*i+2));
                if( !(arr[i] < arr[2*i+1] && arr[i] < arr[2*i+2]) ) {
                    isMinHeap = false;
                    break;
                }
            }
        }

        if (isMinHeap) {
            System.out.println("Min heap data structure");
        } else {
            System.out.println("Not Min heap data structure");
        }
    }
}
