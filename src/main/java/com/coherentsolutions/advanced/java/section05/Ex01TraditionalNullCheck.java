package com.coherentsolutions.advanced.java.section05;

/**
 * Ex01TraditionalNullCheck demonstrates the traditional null check approach before Java 8.
 * In this example, we manually check for null values before performing any operations.
 */
public class Ex01TraditionalNullCheck {
    public static void main(String[] args) {
        String name = getName();  // Could return null

        if (name != null) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println("Name is null");
        }
    }

    public static String getName() {
        return null;  // Simulating a null value
    }
}
