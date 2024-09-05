package com.coherentsolutions.advanced.java.section05;

import java.util.Optional;

/**
 * Ex10MapExample demonstrates the use of map() to apply a function to the value inside the Optional.
 */
public class Ex10MapExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("David");

        // Using map to transform the value inside the Optional
        Optional<String> upperCaseName = name.map(String::toUpperCase);

        upperCaseName.ifPresent(System.out::println);  // Output: DAVID
    }
}
