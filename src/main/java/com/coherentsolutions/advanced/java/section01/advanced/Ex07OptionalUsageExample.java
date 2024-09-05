package com.coherentsolutions.advanced.java.section01.advanced;

import java.util.Optional;

/**
 * Ex07OptionalUsageExample demonstrates how to use Optional to avoid null checks and handle
 * missing values more elegantly. Optional prevents NullPointerExceptions by forcing explicit handling.
 */
public class Ex07OptionalUsageExample {
    public static void main(String[] args) {
        Optional<String> optionalName = getUserName();

        // Using ifPresent to avoid null checks
        optionalName.ifPresentOrElse(
                name -> System.out.println("User's name is: " + name),
                () -> System.out.println("No user found")
        );
    }

    // A method that returns an Optional, which may or may not contain a value
    public static Optional<String> getUserName() {
        // In a real-world scenario, this might come from a database or external system
        return Optional.ofNullable(null);  // Simulating a missing value
    }
}
