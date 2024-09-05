package com.coherentsolutions.advanced.java.section01.advanced;

import java.util.stream.Stream;

/**
 * Ex09InfiniteStreamExample demonstrates how to create and process infinite streams using
 * Stream.iterate() and Stream.generate(). These streams need to be limited to avoid infinite processing.
 */
public class Ex09InfiniteStreamExample {
    public static void main(String[] args) {
        // Generate an infinite stream of integers starting from 1
        Stream.iterate(1, n -> n + 1)
                .limit(10)  // Limit the infinite stream to 10 elements
                .forEach(System.out::println);  // Print each element
    }
}
