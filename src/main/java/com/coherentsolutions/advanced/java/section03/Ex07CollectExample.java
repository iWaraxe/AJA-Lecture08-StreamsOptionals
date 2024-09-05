package com.coherentsolutions.advanced.java.section03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex07CollectExample demonstrates the use of the collect() terminal operation in Streams.
 * It collects the elements of the stream into a list.
 */
public class Ex07CollectExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Collecting the stream into a list
        List<String> nameList = names.stream()
                .collect(Collectors.toList());

        System.out.println("Collected names: " + nameList);
    }
}
