package com.digitalinnovation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<String> myQueue = new Queue();
        myQueue.enqueue("First");
        myQueue.enqueue("Second");
        myQueue.enqueue("Third");
        myQueue.enqueue("Fourth");

        System.out.println(myQueue);
        System.out.println("Removing the first one: " + myQueue.dequeue());
        System.out.println(myQueue);
        System.out.println("Adding the last element...");
        myQueue.enqueue("Last");
        System.out.println(myQueue);
    }
}
