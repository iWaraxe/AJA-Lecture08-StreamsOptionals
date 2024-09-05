package com.coherentsolutions.advanced.java.section03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex05LimitExample demonstrates the use of the limit() intermediate operation in Streams.
 * It truncates the stream to the specified number of elements.
 */
public class Ex05LimitExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        // Limiting the stream to the first 3 numbers
        List<Integer> limitedNumbers = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Limited numbers: " + limitedNumbers);
    }
}
