import java.util.ArrayDeque;
import java.util.Deque;

/**
 * =====================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Deque (Double Ended Queue). Characters are
 * inserted and then compared from front and rear.
 *
 * At this stage, the application:
 * - Inserts all characters into the deque
 * - Removes first and last characters simultaneously
 * - Compares them until the deque is empty or 1 element
 * - Displays the validation result
 *
 * @author Developer
 * @version 7.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        Deque<Character> deque = new ArrayDeque<>();

        // Insert all characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}
