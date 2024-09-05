package com.coherentsolutions.advanced.java.section04;

import java.util.stream.IntStream;

/**
 * Ex03PrimitiveStreamExample demonstrates the use of IntStream, a specialized stream for primitive integers.
 * Primitive streams are more efficient than wrapper types due to avoiding boxing/unboxing overhead.
 */
public class Ex03PrimitiveStreamExample {
    public static void main(String[] args) {
        // Summing numbers from 1 to 10 using IntStream
        int sum = IntStream.rangeClosed(1, 10)  // Creates a stream of integers from 1 to 10
                .sum();

        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}
