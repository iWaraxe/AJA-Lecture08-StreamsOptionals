package com.coherentsolutions.advanced.java.section04;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Ex04GenerateExample demonstrates the use of Stream.generate() to create an infinite stream of random numbers.
 * The stream is limited to 5 elements to avoid infinite processing.
 */
public class Ex04GenerateExample {
    public static void main(String[] args) {
        // Generating 5 random numbers
        Stream.generate(() -> new Random().nextInt(100))  // Infinite stream of random numbers
                .limit(5)  // Limit to 5 elements
                .forEach(System.out::println);
    }
}
