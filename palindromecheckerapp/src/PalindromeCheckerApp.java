import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

interface PalindromeStrategy {
  boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
  public boolean check(String input) {
    Stack<Character> stack = new Stack<>();
    for (char c : input.toCharArray()) stack.push(c);
    StringBuilder reversed = new StringBuilder();
    while (!stack.isEmpty()) reversed.append(stack.pop());
    return input.equals(reversed.toString());
  }
}

class DequeStrategy implements PalindromeStrategy {
  public boolean check(String input) {
    Deque<Character> deque = new ArrayDeque<>();
    for (char c : input.toCharArray()) deque.addLast(c);
    while (deque.size() > 1) {
      if (deque.pollFirst() != deque.pollLast()) return false;
    }
    return true;
  }
}

public class PalindromeCheckerApp {

  public static void main(String[] args) {
    String input = "madam";
    PalindromeStrategy strategy = new StackStrategy();
    boolean isPalindrome = strategy.check(input);
    System.out.println("Input text: " + input);
    System.out.println("Is it a Palindrome: " + isPalindrome);
  }
}
