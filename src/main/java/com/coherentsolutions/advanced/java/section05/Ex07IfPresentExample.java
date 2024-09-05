package com.coherentsolutions.advanced.java.section05;

import java.util.Optional;

/**
 * Ex07IfPresentExample demonstrates the use of ifPresent() to execute an action if the Optional contains a value.
 */
public class Ex07IfPresentExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("Charlie");

        // If value is present, print it
        name.ifPresent(n -> System.out.println("Hello, " + n));
    }
}
