# PalindromeCheckerApp

A Java application that checks whether a given string is a palindrome using 13 different approaches.

## Use Cases

- **UC1** – Prints a welcome message when the application starts.
- **UC2** – Prints a hardcoded palindrome result without any logic check.
- **UC3** – Checks palindrome by reversing the string using `StringBuilder.reverse()`.
- **UC4** – Checks palindrome using a two-pointer approach on a character array.
- **UC5** – Checks palindrome by pushing characters onto a Stack and comparing the reversed output.
- **UC6** – Checks palindrome using both a Queue and a Stack to compare characters pairwise.
- **UC7** – Checks palindrome using a Deque by polling characters from both ends.
- **UC8** – Checks palindrome by converting the string into a singly linked list and comparing halves.
- **UC9** – Checks palindrome recursively by comparing characters from both ends inward.
- **UC10** – Checks palindrome after normalizing the string (case-insensitive, ignores spaces/special characters).
- **UC11** – Encapsulates palindrome logic in an OOP-based `PalindromeChecker` class.
- **UC12** – Implements the Strategy design pattern to dynamically choose a palindrome algorithm at runtime.
- **UC13** – Compares performance of multiple palindrome algorithms using `System.nanoTime()`.
