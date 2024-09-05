package com.coherentsolutions.advanced.java.section01.advanced;

import java.util.stream.IntStream;

/**
 * Ex11PerformanceComparisonExample demonstrates performance comparison between traditional
 * for-loops and Streams for summing integers. Streams offer more declarative programming style but
 * may have overhead compared to for-loops.
 */
public class Ex11PerformanceComparisonExample {
    public static void main(String[] args) {
        long startTime, endTime;

        // Traditional for-loop sum
        startTime = System.nanoTime();
        int sumLoop = 0;
        for (int i = 1; i <= 1_000_000; i++) {
            sumLoop += i;
        }
        endTime = System.nanoTime();
        System.out.println("For-loop sum: " + sumLoop + " (Time: " + (endTime - startTime) + " ns)");

        // Stream-based sum
        startTime = System.nanoTime();
        int sumStream = IntStream.rangeClosed(1, 1_000_000).sum();
        endTime = System.nanoTime();
        System.out.println("Stream sum: " + sumStream + " (Time: " + (endTime - startTime) + " ns)");
    }
}
