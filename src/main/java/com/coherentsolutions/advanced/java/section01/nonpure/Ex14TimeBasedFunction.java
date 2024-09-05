package com.coherentsolutions.advanced.java.section01.nonpure;

import java.time.LocalTime;

/**
 * Ex14TimeBasedFunction demonstrates a non-pure function that depends on external state.
 * The function produces different results depending on the current time.
 */
public class Ex14TimeBasedFunction {

    /**
     * Generates a greeting message based on the current time. This function is non-pure
     * because it relies on the global state of the system's clock.
     *
     * @return A greeting message based on the time of day.
     */
    public static String greetUser() {
        LocalTime currentTime = LocalTime.now(); // Non-pure: Relies on system time
        if (currentTime.isBefore(LocalTime.NOON)) {
            return "Good morning!";
        } else {
            return "Good afternoon!";
        }
    }

    public static void main(String[] args) {
        System.out.println(greetUser()); // The result depends on the current time (external state)
    }
}
