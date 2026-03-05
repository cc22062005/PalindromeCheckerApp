import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

  static boolean checkUsingReverse(String input) {
    String reversed = new StringBuilder(input).reverse().toString();
    return input.equals(reversed);
  }

  static boolean checkUsingStack(String input) {
    Stack<Character> stack = new Stack<>();
    for (char c : input.toCharArray()) stack.push(c);
    StringBuilder reversed = new StringBuilder();
    while (!stack.isEmpty()) reversed.append(stack.pop());
    return input.equals(reversed.toString());
  }

  static boolean checkUsingDeque(String input) {
    Deque<Character> deque = new ArrayDeque<>();
    for (char c : input.toCharArray()) deque.addLast(c);
    while (deque.size() > 1) {
      if (deque.pollFirst() != deque.pollLast()) return false;
    }
    return true;
  }

  static boolean checkUsingRecursion(String s, int start, int end) {
    if (start >= end) return true;
    if (s.charAt(start) != s.charAt(end)) return false;
    return checkUsingRecursion(s, start + 1, end - 1);
  }

  public static void main(String[] args) {
    String input = "madam";

    long start, end;

    start = System.nanoTime();
    boolean r1 = checkUsingReverse(input);
    end = System.nanoTime();
    System.out.println("String Reverse: " + r1 + " | Time: " + (end - start) + " ns");

    start = System.nanoTime();
    boolean r2 = checkUsingStack(input);
    end = System.nanoTime();
    System.out.println("Stack: " + r2 + " | Time: " + (end - start) + " ns");

    start = System.nanoTime();
    boolean r3 = checkUsingDeque(input);
    end = System.nanoTime();
    System.out.println("Deque: " + r3 + " | Time: " + (end - start) + " ns");

    start = System.nanoTime();
    boolean r4 = checkUsingRecursion(input, 0, input.length() - 1);
    end = System.nanoTime();
    System.out.println("Recursion: " + r4 + " | Time: " + (end - start) + " ns");
  }
}
