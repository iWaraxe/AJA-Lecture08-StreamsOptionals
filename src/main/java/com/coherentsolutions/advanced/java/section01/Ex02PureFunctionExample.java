package com.coherentsolutions.advanced.java.section01;

/**
 * Ex02PureFunctionExample demonstrates a pure function that always produces the same output
 * for the same input and does not have side effects (no external state modification).
 */
public class Ex02PureFunctionExample {
    public static int add(int a, int b) {
        return a + b; // No side effects, consistent output
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(5, 10));  // Consistent result every time
    }
}
