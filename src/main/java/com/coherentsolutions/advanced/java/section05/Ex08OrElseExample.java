package com.coherentsolutions.advanced.java.section05;

import java.util.Optional;

/**
 * Ex08OrElseExample demonstrates the use of orElse() to provide a default value if the Optional is empty.
 */
public class Ex08OrElseExample {
    public static void main(String[] args) {
        String name = null;

        // Using orElse to provide a default value
        String result = Optional.ofNullable(name)
                .orElse("Default Name");

        System.out.println(result);  // Output: Default Name
    }
}
