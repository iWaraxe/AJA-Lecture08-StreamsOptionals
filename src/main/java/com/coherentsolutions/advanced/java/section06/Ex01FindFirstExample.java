package com.coherentsolutions.advanced.java.section06;

import java.util.List;
import java.util.Optional;

/**
 * Ex01FindFirstExample demonstrates how to use the Stream operation findFirst()
 * that returns an Optional containing the first element that matches a filter, or an empty Optional if no match is found.
 */
public class Ex01FindFirstExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 7, 10, 12);

        // Finding the first even number in the stream
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        // Handling the result
        firstEven.ifPresentOrElse(
                n -> System.out.println("First even number: " + n),
                () -> System.out.println("No even numbers found")
        );
    }
}
