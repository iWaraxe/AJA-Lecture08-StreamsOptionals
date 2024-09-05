package com.coherentsolutions.advanced.java.section07;

/**
 * Ex05OptionalGetPitfall demonstrates the common pitfall of using Optional.get() without checks,
 * and how to refactor it using orElse() for safe access to Optional values.
 */
import java.util.Optional;

public class Ex05OptionalGetPitfall {
    public static void main(String[] args) {
        // Pitfall: Using Optional.get() without checks
        Optional<String> namePitfall = Optional.ofNullable(null);
        try {
            System.out.println("Name (Pitfall): " + namePitfall.get());  // This will throw an exception
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Best practice: Refactored using orElse()
        Optional<String> nameBestPractice = Optional.ofNullable(null);
        System.out.println("Name (Best practice): " + nameBestPractice.orElse("Unknown"));
    }
}
