package com.coherentsolutions.advanced.java.section05;

import java.util.Optional;

/**
 * Ex09OrElseGetExample demonstrates the use of orElseGet() to provide a default value using a Supplier if the Optional is empty.
 */
public class Ex09OrElseGetExample {
    public static void main(String[] args) {
        String name = null;

        // Using orElseGet with a Supplier for a default value
        String result = Optional.ofNullable(name)
                .orElseGet(() -> "Generated Default");

        System.out.println(result);  // Output: Generated Default
    }
}
