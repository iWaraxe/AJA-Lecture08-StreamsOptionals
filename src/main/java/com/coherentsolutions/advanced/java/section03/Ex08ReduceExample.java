package com.coherentsolutions.advanced.java.section03;

import java.util.List;

/**
 * Ex08ReduceExample demonstrates the use of the reduce() terminal operation in Streams.
 * It reduces the elements of the stream to a single value, in this case, the sum of integers.
 */
public class Ex08ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Reducing the numbers to their sum
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers: " + sum);
    }
}
