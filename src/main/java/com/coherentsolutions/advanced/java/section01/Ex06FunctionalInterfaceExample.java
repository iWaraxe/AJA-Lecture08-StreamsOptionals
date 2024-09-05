package com.coherentsolutions.advanced.java.section01;

import java.util.function.Predicate;

/**
 * Ex06FunctionalInterfaceExample demonstrates the use of a functional interface (Predicate) with a
 * lambda expression. Functional interfaces can be passed around as arguments to methods.
 */
public class Ex06FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Predicate is a functional interface that tests if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(3)); // true
    }
}
