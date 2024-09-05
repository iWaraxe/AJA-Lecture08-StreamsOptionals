package com.coherentsolutions.advanced.java.section04;

import java.util.stream.Stream;

/**
 * Ex05IterateExample demonstrates the use of Stream.iterate() to generate an arithmetic sequence of numbers.
 * The sequence starts from 1 and increments by 2, limited to 5 elements.
 */
public class Ex05IterateExample {
    public static void main(String[] args) {
        // Generating a sequence of numbers, starting from 1 and incrementing by 2
        Stream.iterate(1, n -> n + 2)  // Infinite stream starting from 1, incrementing by 2
                .limit(5)  // Limit to 5 elements
                .forEach(System.out::println);
    }
}
