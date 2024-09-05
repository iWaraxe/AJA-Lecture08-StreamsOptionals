package com.coherentsolutions.advanced.java.section01;

/**
 * Ex04ImperativeExample shows imperative programming, where the focus is on how to perform a task
 * step-by-step. It involves loops and explicit state changes.
 */
public class Ex04ImperativeExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number; // Explicit state modification inside the loop
        }
        System.out.println("Sum: " + sum);
    }
}
