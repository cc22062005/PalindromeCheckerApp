import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * =====================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates FIFO vs LIFO using Queue and Stack.
 * Characters are enqueued and pushed simultaneously.
 * Dequeue (FIFO) and pop (LIFO) outputs are compared.
 *
 * At this stage, the application:
 * - Enqueues and pushes all characters
 * - Compares dequeue vs pop output
 * - Displays the validation result
 *
 * @author Developer
 * @version 6.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push all characters
        for (int i = 0; i < input.length(); i++) {
            queue.add(input.charAt(i));
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare dequeue (FIFO) vs pop (LIFO)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}
