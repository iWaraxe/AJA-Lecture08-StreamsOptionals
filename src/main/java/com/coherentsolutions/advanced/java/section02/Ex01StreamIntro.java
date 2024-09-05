package com.coherentsolutions.advanced.java.section02;

import java.util.List;
import java.util.stream.Stream;

/**
 * Ex01StreamIntro demonstrates the basic use of the Streams API in Java.
 * It creates a stream from a list of integers and performs a simple operation using forEach.
 */
public class Ex01StreamIntro {
    public static void main(String[] args) {
        // A simple list of numbers
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Creating a stream from the list
        Stream<Integer> numberStream = numbers.stream();

        // Perform a simple operation - print each number
        numberStream.forEach(System.out::println);
    }
}
