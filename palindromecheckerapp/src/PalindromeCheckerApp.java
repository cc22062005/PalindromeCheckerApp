public class PalindromeCheckerApp {

  public static void main(String[] args) {
    String input = "madam";
    String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String reversed = new StringBuilder(normalized).reverse().toString();
    boolean isPalindrome = normalized.equals(reversed);
    System.out.println("Input text: " + input);
    System.out.println("Is it a Palindrome: " + isPalindrome);
  }
}
