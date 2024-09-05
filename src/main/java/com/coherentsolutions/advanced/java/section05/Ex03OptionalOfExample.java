package com.coherentsolutions.advanced.java.section05;

import java.util.Optional;

/**
 * Ex03OptionalOfExample demonstrates how to create an Optional using Optional.of() when the value is guaranteed not to be null.
 */
public class Ex03OptionalOfExample {
    public static void main(String[] args) {
        String name = "Alice";

        // Creating an Optional with a non-null value
        Optional<String> optionalName = Optional.of(name);
        System.out.println("Optional value: " + optionalName.get());
    }
}
