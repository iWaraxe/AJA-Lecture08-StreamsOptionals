package com.coherentsolutions.advanced.java.section03;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex04SortedExample demonstrates the use of the sorted() intermediate operation in Streams.
 * It sorts elements in natural order (alphabetically in this case).
 */
public class Ex04SortedExample {
    public static void main(String[] args) {
        List<String> names = List.of("Charlie", "Alice", "Bob", "David");

        // Sorting names alphabetically
        List<String> sortedNames = names.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println("Sorted names: " + sortedNames);
    }
}
