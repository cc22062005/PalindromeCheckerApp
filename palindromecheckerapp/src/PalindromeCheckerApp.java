/**
 * =====================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by converting it into a character array and using
 * the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts the string to a char[]
 * - Uses two pointers (start and end)
 * - Compares characters from both ends moving inward
 * - Displays the validation result
 *
 * @author Developer
 * @version 4.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        char[] chars = input.toCharArray();
        boolean isPalindrome = true;

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}
