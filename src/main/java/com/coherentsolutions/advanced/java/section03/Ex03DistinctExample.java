package com.coherentsolutions.advanced.java.section03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex03DistinctExample demonstrates the use of the distinct() intermediate operation in Streams.
 * It removes duplicate elements from the stream.
 */
public class Ex03DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);

        // Removing duplicates using distinct()
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct numbers: " + distinctNumbers);
    }
}
