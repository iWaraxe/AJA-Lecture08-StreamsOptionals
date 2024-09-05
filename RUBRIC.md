## Rubric for Rewriting Imperative Code Using Functional Programming with Streams API and Optionals

### **Task Overview:**
You will refactor the given Java code to adopt a functional programming style using **Streams API** and **Optional**. The goal is to process a collection of books and refactor null-checking methods to use `Optional`, eliminating the risk of `NullPointerException`.

---

## **Task 1: Refactor BookProcessor Class to Use Streams API and Optional** (60 points)

### **1. Use Streams API to Filter Books by Author** (15 points)
- **Full Points (15/15):** The program successfully replaces the imperative for-loop with a stream pipeline using `filter()` to select books by a specific author.
- **Partial Points (7-14/15):** The filtering is implemented using streams, but may have issues such as incorrect stream logic or not handling author comparison properly.
- **No Points (0/15):** The filtering is still done using a traditional for-loop or is entirely incorrect.

### **2. Use Streams API to Sort Books by Publication Date** (10 points)
- **Full Points (10/10):** The program uses `sorted()` in the stream pipeline to sort books by their publication date in ascending order.
- **Partial Points (5-9/10):** Sorting is implemented using streams but may have minor issues, such as incorrect sorting logic or improper use of the comparator.
- **No Points (0/10):** Sorting is still done using a traditional sorting algorithm or is not implemented.

### **3. Replace Null Handling with Optional** (15 points)
- **Full Points (15/15):** The program refactors the null-checking logic to return an `Optional<Book>` instead of `null`. `Optional.ofNullable()`, `findFirst()`, or similar methods are used correctly to handle missing data.
- **Partial Points (7-14/15):** `Optional` is used, but the implementation may have issues such as improper usage or failure to replace all null checks.
- **No Points (0/15):** `Optional` is not used, and the program still uses traditional null checks.

### **4. Handle Optional Correctly in the Main Method** (10 points)
- **Full Points (10/10):** The program handles the `Optional<Book>` correctly using methods like `ifPresentOrElse()`, `orElse()`, or `orElseThrow()`, without invoking `Optional.get()` directly.
- **Partial Points (5-9/10):** `Optional` is handled but with some issues, such as improper use of `Optional.get()` or redundant null checks.
- **No Points (0/10):** The program does not handle `Optional` correctly, or it still uses null-checking logic.

### **5. Code Clarity and Readability** (10 points)
- **Full Points (10/10):** The refactored code is clean, readable, and adheres to Java conventions. It uses meaningful variable names, appropriate lambda expressions, and consistent formatting.
- **Partial Points (5-9/10):** The code is functional but may have issues such as poor variable naming, inconsistent formatting, or overly complex lambda expressions.
- **No Points (0/10):** The code is poorly written, difficult to read, or fails to follow Java conventions.

---

## **Task 2: Refactor UserService and Main Classes to Use Optional** (40 points)

### **1. Refactor the Method to Return Optional Instead of Null** (15 points)
- **Full Points (15/15):** The `getUserByEmail()` method is refactored to return an `Optional<String>` instead of `null`, using `Optional.of()` or `Optional.ofNullable()` as appropriate.
- **Partial Points (7-14/15):** The method is refactored to use `Optional`, but there may be issues such as incorrect wrapping of values or improper handling of absent values.
- **No Points (0/15):** The method still returns `null` or is incorrectly refactored.

### **2. Refactor the Main Class to Handle Optional Correctly** (15 points)
- **Full Points (15/15):** The main method is refactored to handle the `Optional<String>` result safely using methods like `ifPresent()`, `orElse()`, `orElseGet()`, or `ifPresentOrElse()` without invoking `Optional.get()`.
- **Partial Points (7-14/15):** The main method is refactored, but issues persist, such as improper handling of absent values, redundant null checks, or improper use of `Optional.get()`.
- **No Points (0/15):** The main method still relies on null checks or does not handle `Optional` properly.

### **3. Handle NullPointerException Risk** (10 points)
- **Full Points (10/10):** The program eliminates the risk of `NullPointerException` by properly handling the `Optional` result and not attempting to call methods on potentially null objects.
- **Partial Points (5-9/10):** The program addresses some `NullPointerException` risks, but issues like calling methods on unwrapped Optionals or improper null handling remain.
- **No Points (0/10):** The program still risks throwing `NullPointerException` or does not handle null values correctly.

---

### **Total Points: 100**

This rubric evaluates the understanding and application of functional programming principles using **Streams API** and **Optional**. It encourages the proper handling of data processing and null handling in Java, reinforcing clean, safe, and modern Java practices.