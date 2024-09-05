## **Task 1: Implement a Program to Process a Collection of Books**

For the first task, you will implement a Java program that processes a collection of books using the **Streams API** and **Optional**. This will help you get hands-on experience with stream operations, sorting, and working with potentially null data using Optional.

---

### **1. Program Overview:**

You will work with a collection of books, each represented by a class `Book`. The program should allow you to:
1. **Filter the books** by a specific author.
2. **Sort the books** by their publication date.
3. **Use `Optional`** to return the first book found by the author or display a message if no book is found.

### **2. Steps to Complete Task 1:**

1. **Define the `Book` class**:
    2. Each book should have a title, author, and publication date.
2. **Create a collection of books**:
    4. Use a list of `Book` objects to represent a collection of books.

3. **Process the books using Streams API**:
    2. **Filter** the books by a specific author.
    3. **Sort** the filtered books by their publication date.
    4. Use **Optional** to return the first book found by the author.

4. **Handle empty results**:
    2. If no books by the specified author are found, return an empty `Optional` and display a friendly message instead of throwing an exception.

---

### **Key Points to Remember for Task 1**:
- Use `filter()` to narrow down the books by author.
- Use `sorted()` to arrange the books by publication date.
- Use `Optional` and handle cases where no book is found with `ifPresentOrElse()`.

---

## **Task 2: Refactor Method to Use Optional**

For Task 2, you will refactor an existing method that may return `null`, such as a `getUserByEmail()` method, to return an **Optional** instead. This will allow you to handle potential `null` values more safely and cleanly.

---

### **The Original Method (Handling Null Values)**

Here is an example of the original method that might return `null`:

```java
public class UserService {
    public static String getUserByEmail(String email) {
        if (email.equalsIgnoreCase("example@example.com")) {
            return "John Doe";
        } else {
            return null;  // This is the problematic null return
        }
    }
}
```

- **Explanation**:  
  In the original method, we are returning `null` if the email doesn’t match. This is a potential source of `NullPointerException` because the caller might not check for `null`.

---

### **Key Points to Remember for Task 2**:
- Use `Optional.of()` to wrap a non-null value.
- Use `Optional.empty()` to represent the absence of a value.
- Refactor the calling code to handle the `Optional` with `ifPresent()`, `ifPresentOrElse()`, or `orElse()`.

---

## **Conclusion**

In summary, here’s what you need to do for your homework:
- **Task 1**: Implement a small program that processes a collection of books using the Streams API to filter by author, sort by publication date, and handle missing data using `Optional`.
- **Task 2**: Refactor an existing method that handles `null` values (such as `getUserByEmail()`) to return an `Optional` and adjust the calling code accordingly.

These tasks will give you hands-on experience with **Streams** and **Optional**, two powerful tools in modern Java development. Make sure you understand the key concepts of using streams for processing collections and leveraging Optional for null safety.

Good luck, and feel free to ask questions if you encounter any issues!