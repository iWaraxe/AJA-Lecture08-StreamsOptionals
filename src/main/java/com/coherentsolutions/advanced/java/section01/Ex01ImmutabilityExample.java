// Package for the basic introduction to functional programming in Java
package com.coherentsolutions.advanced.java.section01;

/**
 * Ex01ImmutabilityExample demonstrates the concept of immutability in functional programming.
 * Once a value is set, it cannot be changed. Java supports this by using the 'final' keyword.
 */
public class Ex01ImmutabilityExample {
    public static void main(String[] args) {
        final int number = 5; // The 'final' keyword makes this variable immutable
        //number = 10; // Uncommenting this will cause a compile-time error
        System.out.println("Immutable value: " + number);
    }
}
