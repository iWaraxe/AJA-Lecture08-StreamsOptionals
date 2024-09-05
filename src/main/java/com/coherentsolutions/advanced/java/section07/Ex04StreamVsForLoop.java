package com.coherentsolutions.advanced.java.section07;

/**
 * Ex04StreamVsForLoop demonstrates the difference between using streams and for-loops.
 * Streams are cleaner for complex operations, while loops may still be better for simple iterations.
 */
import java.util.List;

public class Ex04StreamVsForLoop {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        // Stream example for filtering names with more than 3 characters
        System.out.println("Stream-based filtering:");
        names.stream()
                .filter(name -> name.length() > 3)
                .forEach(System.out::println);

        // Traditional for-loop example for the same filtering operation
        System.out.println("\nFor-loop filtering:");
        for (String name : names) {
            if (name.length() > 3) {
                System.out.println(name);
            }
        }
    }
}
