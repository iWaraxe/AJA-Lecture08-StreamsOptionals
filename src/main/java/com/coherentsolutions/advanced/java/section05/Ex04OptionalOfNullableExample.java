package com.coherentsolutions.advanced.java.section05;

import java.util.Optional;

/**
 * Ex04OptionalOfNullableExample demonstrates how to create an Optional using Optional.ofNullable()
 * when the value might be null.
 */
public class Ex04OptionalOfNullableExample {
    public static void main(String[] args) {
        String name = null;

        // Creating an Optional that might hold a null value
        Optional<String> optionalName = Optional.ofNullable(name);

        // Checking if value is present
        System.out.println("Is name present? " + optionalName.isPresent());
    }
}
