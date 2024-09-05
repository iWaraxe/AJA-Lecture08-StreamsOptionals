package com.coherentsolutions.advanced.java.section02;

import java.util.List;
import java.util.stream.Stream;

/**
 * Ex02LazyEvaluationExample demonstrates the lazy evaluation property of Streams in Java.
 * Intermediate operations like filter() do not execute until a terminal operation is invoked.
 */
public class Ex02LazyEvaluationExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        // Creating a stream and applying intermediate operations
        Stream<String> nameStream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });

        System.out.println("No terminal operation yet!");

        // The filtering only occurs when the terminal operation (forEach) is called
        nameStream.forEach(System.out::println);
    }
}
