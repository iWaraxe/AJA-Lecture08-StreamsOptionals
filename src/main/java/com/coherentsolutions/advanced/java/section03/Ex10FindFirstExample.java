package com.coherentsolutions.advanced.java.section03;

import java.util.List;
import java.util.Optional;

/**
 * Ex10FindFirstExample demonstrates the use of the findFirst() terminal operation in Streams.
 * It returns the first element of the stream, if present, wrapped in an Optional.
 */
public class Ex10FindFirstExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Finding the first element in the stream
        Optional<String> firstName = names.stream()
                .filter(name -> name.length() > 5)
                .findFirst();

        firstName.ifPresent(name -> System.out.println("First name: " + name));
    }
}
