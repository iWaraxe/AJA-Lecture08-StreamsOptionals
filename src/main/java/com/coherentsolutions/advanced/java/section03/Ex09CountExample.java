package com.coherentsolutions.advanced.java.section03;

import java.util.List;

/**
 * Ex09CountExample demonstrates the use of the count() terminal operation in Streams.
 * It returns the number of elements in the stream.
 */
public class Ex09CountExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Counting the number of elements in the stream
        long count = names.stream()
                .count();

        System.out.println("Count of names: " + count);
    }
}
