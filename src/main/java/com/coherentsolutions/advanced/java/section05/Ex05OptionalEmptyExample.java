package com.coherentsolutions.advanced.java.section05;

import java.util.Optional;

/**
 * Ex05OptionalEmptyExample demonstrates how to create an explicitly empty Optional using Optional.empty().
 */
public class Ex05OptionalEmptyExample {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Is value present? " + emptyOptional.isPresent());
    }
}
