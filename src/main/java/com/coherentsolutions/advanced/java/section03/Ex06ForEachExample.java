package com.coherentsolutions.advanced.java.section03;

import java.util.List;

/**
 * Ex06ForEachExample demonstrates the use of the forEach() terminal operation in Streams.
 * It applies the given action (printing) to each element in the stream.
 */
public class Ex06ForEachExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Printing each name using forEach
        names.stream()
                .forEach(System.out::println);
    }
}
