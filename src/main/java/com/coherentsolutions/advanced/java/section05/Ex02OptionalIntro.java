package com.coherentsolutions.advanced.java.section05;

import java.util.Optional;

/**
 * Ex02OptionalIntro demonstrates how to use Optional to handle potentially null values in a safer way.
 * The method returns an Optional, and we handle both cases where a value is present or absent.
 */
public class Ex02OptionalIntro {
    public static void main(String[] args) {
        Optional<String> name = getName();

        name.ifPresentOrElse(
                n -> System.out.println(n.toUpperCase()),  // If value is present
                () -> System.out.println("Name is null")  // If value is absent
        );
    }

    public static Optional<String> getName() {
        return Optional.ofNullable(null);  // Wrapping a possibly null value in Optional
    }
}
