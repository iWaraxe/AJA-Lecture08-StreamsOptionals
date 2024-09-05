package com.coherentsolutions.advanced.java.section07;

import java.util.Optional;

/**
 * Ex02OptionalFieldAntiPattern demonstrates why using Optional as a field is an anti-pattern
 * and how it can be refactored to simplify class design.
 */
public class Ex02OptionalFieldAntiPattern {
    public static void main(String[] args) {
        // Anti-pattern: Using Optional as a field
        UserWithOptional userWithOptional = new UserWithOptional(null);
        System.out.println("Email (Anti-pattern): " + userWithOptional.getEmail().orElse("No email"));

        // Refactored: Avoiding Optional as a field
        UserWithRefactoredField userRefactored = new UserWithRefactoredField(null);
        System.out.println("Email (Refactored): " + userRefactored.getEmail().orElse("No email"));
    }
}

// Anti-pattern class with Optional as a field
class UserWithOptional {
    private Optional<String> email;

    public UserWithOptional(String email) {
        this.email = Optional.ofNullable(email);
    }

    public Optional<String> getEmail() {
        return email;
    }
}

// Refactored class avoiding Optional as a field
class UserWithRefactoredField {
    private String email;

    public UserWithRefactoredField(String email) {
        this.email = email;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
