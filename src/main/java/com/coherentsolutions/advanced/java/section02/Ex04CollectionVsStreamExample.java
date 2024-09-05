package com.coherentsolutions.advanced.java.section02;

import java.util.List;

/**
 * Ex04CollectionVsStreamExample demonstrates the difference between
 * using Collections directly and using Streams for processing data.
 */
public class Ex04CollectionVsStreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Bob", "Catherine", "Daniel");

        // Using a Collection directly (imperative style)
        System.out.println("Using Collection (Imperative):");
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        // Using a Stream (declarative style)
        System.out.println("\nUsing Stream (Declarative):");
        names.stream()
                .map(String::toUpperCase) // Intermediate operation (transform)
                .forEach(System.out::println); // Terminal operation
    }
}
