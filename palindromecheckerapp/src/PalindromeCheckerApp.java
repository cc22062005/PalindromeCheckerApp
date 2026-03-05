class PalindromeChecker {

  public boolean checkPalindrome(String input) {
    String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String reversed = new StringBuilder(normalized).reverse().toString();
    return normalized.equals(reversed);
  }
}

public class PalindromeCheckerApp {

  public static void main(String[] args) {
    String input = "madam";
    PalindromeChecker checker = new PalindromeChecker();
    boolean isPalindrome = checker.checkPalindrome(input);
    System.out.println("Input text: " + input);
    System.out.println("Is it a Palindrome: " + isPalindrome);
  }
}
