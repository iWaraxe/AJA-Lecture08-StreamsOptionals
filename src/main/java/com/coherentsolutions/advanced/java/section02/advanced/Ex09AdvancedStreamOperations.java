package com.coherentsolutions.advanced.java.section02.advanced;

import java.util.stream.Stream;
import java.util.function.Predicate;

/**
 * Ex09AdvancedStreamOperations demonstrates the advanced use of stream operations.
 * It uses filter, anyMatch, and a combination of predicates to process data.
 */
public class Ex09AdvancedStreamOperations {
    public static void main(String[] args) {
        // Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Predicate to check if a number is greater than 10
        Predicate<Integer> greaterThanTen = number -> number > 10;

        // Stream pipeline using combined predicates and anyMatch
        boolean result = Stream.of(2, 4, 8, 16, 32)
                .filter(greaterThanTen) // Filter numbers greater than 10
                .anyMatch(isEven); // Check if any number is even after filtering

        System.out.println("Is there any even number greater than 10? " + result);
    }
}
