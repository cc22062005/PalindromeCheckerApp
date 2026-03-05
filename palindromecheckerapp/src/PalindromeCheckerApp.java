import java.util.Stack;

/**
 * =====================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by using a Stack data structure to reverse characters
 * and then comparing with the original string.
 *
 * At this stage, the application:
 * - Pushes all characters onto a Stack
 * - Pops characters to build reversed string
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * @author Developer
 * @version 5.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}
