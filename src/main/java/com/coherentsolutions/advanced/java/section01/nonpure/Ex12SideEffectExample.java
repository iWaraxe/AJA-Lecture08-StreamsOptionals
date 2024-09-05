package com.coherentsolutions.advanced.java.section01.nonpure;

/**
 * Ex12SideEffectExample demonstrates a non-pure function that modifies external state.
 * This function introduces side effects, making the code harder to test and maintain.
 */
public class Ex12SideEffectExample {
    // Global variable
    static int counter = 0;

    /**
     * This function increments the counter, modifying the global state.
     */
    public static void incrementCounter() {
        counter++; // Side effect: Modifying global state
    }

    public static void main(String[] args) {
        System.out.println("Counter before: " + counter); // 0
        incrementCounter();
        System.out.println("Counter after: " + counter);  // 1 (side effect occurred)
        incrementCounter();
        System.out.println("Counter after: " + counter);  // 1 (side effect occurred)
    }
}
