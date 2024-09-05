package com.coherentsolutions.advanced.java.section01;

import java.util.function.Function;

/**
 * Ex03HigherOrderFunctionExample demonstrates higher-order functions, which accept
 * other functions as arguments or return functions.
 */
public class Ex03HigherOrderFunctionExample {
    public static void main(String[] args) {
        // A function that doubles the given value
        Function<Integer, Integer> doubleValue = x -> x * 2;
        System.out.println("Double of 5: " + applyFunction(doubleValue, 5));
    }

    // A higher-order function that takes another function as a parameter
    public static int applyFunction(Function<Integer, Integer> function, int value) {
        return function.apply(value);  // Apply the provided function to the value
    }
}
