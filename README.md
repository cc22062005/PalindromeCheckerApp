# PalindromeCheckerApp

A Java-based application that checks whether a given string is a palindrome. This project progressively implements palindrome checking using multiple algorithms and design patterns across 13 Use Cases (UC1–UC13).

---

## Use Cases

### UC1 – Application Entry & Welcome Message
- Sets up the main Java application entry point.
- Prints a welcome message to the console when the application starts.
- Establishes the base structure (`main` method) used in all subsequent use cases.

### UC2 – Print a Hardcoded Palindrome Result
- Hardcodes the input string `"madam"` directly in the program.
- Prints whether the hardcoded string is a palindrome without any logic check.
- Demonstrates the basic output format used throughout the project.

### UC3 – Palindrome Check Using String Reverse
- Accepts the input string `"madam"`.
- Reverses the string using `StringBuilder.reverse()`.
- Compares the reversed string with the original to determine if it is a palindrome.
- **Data Structure:** String

### UC4 – Character Array Based Palindrome Check
- Converts the input string into a character array.
- Uses a two-pointer technique: one pointer starts from the beginning and one from the end.
- Compares characters moving inward until the pointers meet.
- **Data Structure:** `char[]` Array

### UC5 – Stack-Based Palindrome Checker
- Pushes all characters of the input string onto a `Stack`.
- Pops characters one by one to reconstruct the reversed string.
- Compares the reversed string with the original to check for palindrome.
- **Data Structure:** Stack

### UC6 – Queue + Stack Based Palindrome Check
- Uses both a `Queue` and a `Stack` simultaneously.
- Enqueues and pushes characters of the string.
- Dequeues from the front and pops from the stack, comparing characters pairwise.
- **Data Structure:** Queue + Stack

### UC7 – Deque-Based Optimized Palindrome Checker
- Uses a `Deque` (double-ended queue) for an optimized comparison.
- Adds characters to both ends using `addFirst` and `addLast` alternately.
- Polls characters from both ends and compares them.
- **Data Structure:** Deque

### UC8 – Linked List Based Palindrome Checker
- Converts the input string into a singly linked list of characters.
- Finds the middle of the list using fast and slow pointer technique.
- Reverses the second half of the linked list in-place.
- Compares the first half with the reversed second half.
- **Data Structure:** Singly Linked List

### UC9 – Recursive Palindrome Checker
- Implements a recursive method `isPalindrome(String str, int start, int end)`.
- Compares characters at `start` and `end` positions in each recursive call.
- Base condition: returns `true` when `start >= end`.
- Returns `false` immediately if characters don't match.
- **Key Concept:** Recursion

### UC10 – Case-Insensitive & Space-Ignored Palindrome
- Normalizes the input string by removing all non-alphanumeric characters using `replaceAll("[^a-zA-Z0-9]", "")`.
- Converts the normalized string to lowercase.
- Checks if the normalized string equals its reverse.
- **Key Concepts:** String pre-processing, Regular expressions

### UC11 – Object-Oriented Palindrome Service
- Encapsulates all palindrome logic inside a dedicated `PalindromeChecker` class.
- Exposes a public `checkPalindrome(String input)` method for reusability.
- Demonstrates the Single Responsibility Principle and Encapsulation (OOP).
- **Key Concepts:** Encapsulation, Single Responsibility Principle

### UC12 – Strategy Pattern for Palindrome Algorithms
- Defines a `PalindromeStrategy` interface with a `check(String input)` method.
- Implements two concrete strategies: `StackStrategy` and `DequeStrategy`.
- Injects the desired strategy at runtime into the main app (Strategy Design Pattern).
- Allows switching algorithms dynamically without changing the client code.
- **Key Concepts:** Interface, Polymorphism, Strategy Design Pattern

### UC13 – Performance Comparison
- Runs all four palindrome-checking approaches: String Reverse, Stack, Deque, and Recursion.
- Measures execution time of each approach using `System.nanoTime()`.
- Displays the result and time taken for each algorithm side by side.
- Enables comparison of algorithm performance for the same input.
- **Key Concepts:** `System.nanoTime()`, Algorithm comparison

---

## Project Structure

```
PalindromeCheckerApp/
└── palindromecheckerapp/
    └── src/
        └── PalindromeCheckerApp.java
```

## How to Run

```bash
javac PalindromeCheckerApp.java
java PalindromeCheckerApp
```

## Author

[cc22062005](https://github.com/cc22062005)
