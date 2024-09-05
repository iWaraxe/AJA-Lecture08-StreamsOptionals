package com.coherentsolutions.advanced.java.section01.advanced;

import java.util.function.BiFunction;

/**
 * Ex10AdvancedHigherOrderFunction demonstrates advanced higher-order functions that take in
 * multiple functions as parameters and return functions as results.
 */
public class Ex10AdvancedHigherOrderFunction {
    public static void main(String[] args) {
        // Defining a function that adds two numbers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // Using a higher-order function that accepts a BiFunction and values
        System.out.println("Result of addition: " + calculate(add, 10, 20));
    }

    // Higher-order function that takes in a BiFunction
    public static int calculate(BiFunction<Integer, Integer, Integer> operation, int x, int y) {
        return operation.apply(x, y);
    }
}
