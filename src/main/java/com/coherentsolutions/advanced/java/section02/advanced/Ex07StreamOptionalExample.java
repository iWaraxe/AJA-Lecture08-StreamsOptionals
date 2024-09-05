package com.coherentsolutions.advanced.java.section02.advanced;

import java.util.List;
import java.util.Optional;

/**
 * Ex07StreamOptionalExample demonstrates how to integrate Streams and Optional in Java.
 * It uses Streams to process a list and returns the first match wrapped in an Optional.
 */
public class Ex07StreamOptionalExample {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Bob", "Charlie");

        // Stream pipeline that finds the first name starting with 'B' and wraps it in an Optional
        Optional<String> firstNameWithB = names.stream()
                .filter(name -> name.startsWith("B"))
                .findFirst(); // Terminal operation that returns an Optional

        // Handling the Optional result
        firstNameWithB.ifPresentOrElse(
                name -> System.out.println("First name starting with 'B': " + name),
                () -> System.out.println("No name starting with 'B' found")
        );
    }
}
