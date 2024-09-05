package com.coherentsolutions.advanced.java.section07;

/**
 * Ex03ParallelStreamExample demonstrates the proper use of parallel streams for large data processing.
 */
import java.util.stream.LongStream;

public class Ex03ParallelStreamExample {
    public static void main(String[] args) {
        // Summing a large range of numbers using parallel stream
        long sum = LongStream.rangeClosed(1, 1_000_000)
                .parallel()  // Parallel processing
                .sum();

        System.out.println("Sum using parallel stream: " + sum);
    }
}
