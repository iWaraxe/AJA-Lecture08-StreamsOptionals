package com.coherentsolutions.advanced.java.section01;

import java.util.Arrays;

/**
 * Ex05DeclarativeExample shows declarative programming, where the focus is on what to do rather than
 * how to do it. It describes the result using higher-level functions.
 */
public class Ex05DeclarativeExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).sum();  // Functional and declarative approach
        System.out.println("Sum: " + sum);
    }
}
