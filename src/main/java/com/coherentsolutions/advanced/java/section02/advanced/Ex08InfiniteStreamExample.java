package com.coherentsolutions.advanced.java.section02.advanced;

import java.util.stream.Stream;

/**
 * Ex08InfiniteStreamExample demonstrates how to create and process infinite streams in Java.
 * It uses Stream.iterate() to create an infinite stream and processes only a limited number of elements.
 */
public class Ex08InfiniteStreamExample {
    public static void main(String[] args) {
        // Generate an infinite stream of integers starting from 1
        Stream.iterate(1, n -> n + 1)
                .limit(10) // Limit the infinite stream to 10 elements
                .forEach(System.out::println); // Print each element
    }
}
