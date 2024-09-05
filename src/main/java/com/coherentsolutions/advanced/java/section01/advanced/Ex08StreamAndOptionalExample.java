package com.coherentsolutions.advanced.java.section01.advanced;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Ex08StreamAndOptionalExample demonstrates how to use the Streams API with Optional.
 * Streams provide a declarative way to process data, and Optional ensures safe handling of missing data.
 */
public class Ex08StreamAndOptionalExample {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};

        // Stream pipeline that finds the first name starting with 'B' and wraps it in an Optional
        Optional<String> firstNameWithB = Stream.of(names)
                .filter(name -> name.startsWith("B"))
                .findFirst();

        // Handling the Optional result
        firstNameWithB.ifPresentOrElse(
                name -> System.out.println("First name starting with 'B': " + name),
                () -> System.out.println("No name starting with 'B' found")
        );
    }
}
