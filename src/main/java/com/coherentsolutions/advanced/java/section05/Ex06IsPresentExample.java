package com.coherentsolutions.advanced.java.section05;

import java.util.Optional;

/**
 * Ex06IsPresentExample demonstrates the use of isPresent() to check if an Optional contains a value.
 */
public class Ex06IsPresentExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("Bob");

        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        } else {
            System.out.println("Name is not present");
        }
    }
}
