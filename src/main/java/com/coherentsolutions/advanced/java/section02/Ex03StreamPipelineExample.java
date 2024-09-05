package com.coherentsolutions.advanced.java.section02;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex03StreamPipelineExample demonstrates the pipeline architecture of streams.
 * It processes a list of names by filtering, mapping, sorting, and collecting results.
 */
public class Ex03StreamPipelineExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Jack", "Jill");

        // Source -> Intermediate Operations -> Terminal Operation (pipeline)
        List<String> result = names.stream() // Source
                .filter(name -> name.startsWith("J")) // Intermediate operation
                .map(String::toUpperCase) // Intermediate operation
                .sorted() // Intermediate operation
                .collect(Collectors.toList()); // Terminal operation

        System.out.println(result);// Output: [JACK, JANE, JILL, JOHN]
        System.out.println(names);
    }
}
