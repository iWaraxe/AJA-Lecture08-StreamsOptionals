package com.coherentsolutions.advanced.java.section06;

import java.util.List;
import java.util.Optional;

/**
 * Ex03UserExercise demonstrates a practical example where we filter a list of users to find the first user
 * who is 18 or older, and return their name wrapped in an Optional.
 */
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Ex03UserExercise {
    public static void main(String[] args) {
        // List of users with varying ages
        List<User> users = List.of(
                new User("Alice", 17),
                new User("Bob", 20),
                new User("Charlie", 16),
                new User("David", 25)
        );

        // Calling the method to find the first adult user
        Optional<String> firstAdult = getFirstAdultUser(users);

        // Handling the result
        firstAdult.ifPresentOrElse(
                name -> System.out.println("First adult user: " + name),
                () -> System.out.println("No adult users found")
        );
    }

    // Method to find the first user who is 18 or older
    public static Optional<String> getFirstAdultUser(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 18)  // Filter users aged 18 or older
                .map(User::getName)  // Get the name of the user
                .findFirst();  // Return the first match as an Optional
    }
}
