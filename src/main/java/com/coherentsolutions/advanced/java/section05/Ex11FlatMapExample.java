package com.coherentsolutions.advanced.java.section05;

import java.util.Optional;

/**
 * Ex11FlatMapExample demonstrates the use of flatMap() when the function returns an Optional, avoiding nested Optionals.
 */
public class Ex11FlatMapExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Emily");

        // flatMap example
        Optional<String> optionalGreeting = name.flatMap(n -> getGreeting(n));

        optionalGreeting.ifPresent(System.out::println);
    }

    public static Optional<String> getGreeting(String name) {
        return Optional.of("Hello, " + name);
    }
}
