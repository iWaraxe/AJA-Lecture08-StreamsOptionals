package com.coherentsolutions.advanced.java.section04;

import java.util.List;

/**
 * Ex01ParallelStreamExample demonstrates the use of parallel streams in Java.
 * Parallel streams allow for concurrent processing, but the order of execution is not guaranteed.
 */
public class Ex01ParallelStreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        // Sequential stream example
        System.out.println("Sequential Stream:");
        names.stream()
                .forEach(System.out::println);

        System.out.println("\nParallel Stream:");
        // Converting to parallel stream
        names.parallelStream()
                .forEach(System.out::println);  // Order is not guaranteed
    }
}
