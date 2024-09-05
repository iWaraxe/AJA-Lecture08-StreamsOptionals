package com.coherentsolutions.advanced.java.section03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex01FilterExample demonstrates the use of the filter() intermediate operation in Streams.
 * It filters elements from the stream based on a condition, in this case, names longer than 3 characters.
 */
public class Ex01FilterExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        // Filtering names with more than 3 characters
        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());

        System.out.println("Filtered names: " + filteredNames);
    }
}
