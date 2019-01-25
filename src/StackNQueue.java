/*
 This simple Java program demonstrates how Stacks and Queues work.
 @author Joshua Button
 @version 0.1
 @date 24/01/2019
 @website www.joshuabutton.co.uk
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StackNQueue {

    public static void main(String[] args) throws InterruptedException {
        String choice = "a";
        Scanner kb = new Scanner(System.in); // Crate a scanner for keyboard

        while(!choice.equalsIgnoreCase("e")){
            System.out.println("==Josh's Stack 'n' Queue==");
            System.out.println("s) Stack Example");
            System.out.println("q) Queue Example");
            System.out.println("e) Exit");
            choice = kb.nextLine();
            switch(choice) {
                case "q":
                    queueExample();
                break;

                case "s":
                    stackExample();
                break;
            }
        }
        System.out.println("Quiting...");
    }

    private static void queueExample() throws InterruptedException {
        Queue<String> queuedItems = new LinkedList<>(); // Create a Queue using a LinkedList
        Scanner kb = new Scanner(System.in); // Crate a scanner for keyboard

        System.out.println("What is your name?"); // Prompt uer for input
        String name = kb.nextLine(); // Take user input

        // Pushing letters of user input into a queue
        for (String s : name.split("")) {
            queuedItems.add(s);
        }

        while (!queuedItems.isEmpty()){
            System.out.println("Queue = " + queuedItems);
            System.out.println();

            System.out.println("Press enter to dequeue an item...");
            kb.nextLine(); // Wait for enter key IO Block

            // Popping items from the Stack
            String dequeued = queuedItems.remove();  // Throws EmptyStackException if the stack is empty
            System.out.println("queuedItems.remove() = " + dequeued);
            System.out.println();

        }
        System.out.println("The queue is now empty. You can see how queues could be useful for... well queues.");
        System.out.println();
        TimeUnit.SECONDS.sleep(5);
    }

    private static void stackExample() throws InterruptedException {
        java.util.Stack<String> stack = new java.util.Stack<>(); // Creating a Stack
        Scanner kb = new Scanner(System.in); // Crate a scanner for keyboard

        System.out.println("What is your name?"); // Prompt uer for input
        String name = kb.nextLine(); // Take user input

        // Pushing letters of user input into a stack
        for (String s : name.split("")) {
            stack.push(s);
        }

        while (!stack.isEmpty()){
            System.out.println("Stack = " + stack);
            System.out.println();

            System.out.println("Press enter to pop an item...");
            kb.nextLine(); // Wait for enter key IO Block

            // Popping items from the Stack
            String popped = stack.pop();  // Throws EmptyStackException if the stack is empty
            System.out.println("Stack.pop() = " + popped);
            System.out.println();

        }
        System.out.println("The stack is now empty. You can see how stacks could be useful for backtracking/undoing.");
        System.out.println();
        TimeUnit.SECONDS.sleep(5);
    }
}
