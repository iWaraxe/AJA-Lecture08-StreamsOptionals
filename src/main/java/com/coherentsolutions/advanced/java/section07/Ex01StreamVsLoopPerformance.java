package com.coherentsolutions.advanced.java.section07;

/**
 * Ex01StreamVsLoopPerformance demonstrates performance comparison between
 * a traditional for-loop and stream-based processing for summing numbers.
 */
import java.util.stream.IntStream;

public class Ex01StreamVsLoopPerformance {
    public static void main(String[] args) {
        long startTime, endTime;

        // Traditional for-loop
        startTime = System.nanoTime();
        int sumLoop = 0;
        for (int i = 1; i <= 1_000_000; i++) {
            sumLoop += i;
        }
        endTime = System.nanoTime();
        System.out.println("Sum using loop: " + sumLoop + " (Time: " + (endTime - startTime) + " ns)");

        // Stream-based sum
        startTime = System.nanoTime();
        int sumStream = IntStream.rangeClosed(1, 1_000_000).sum();
        endTime = System.nanoTime();
        System.out.println("Sum using stream: " + sumStream + " (Time: " + (endTime - startTime) + " ns)");
    }
}
