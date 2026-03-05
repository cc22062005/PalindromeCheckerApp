/**
 * =====================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a singly linked list with fast and slow pointer
 * technique to find the middle, reverse the second half,
 * and compare with the first half.
 *
 * @author Developer
 * @version 8.0
 */
public class PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Build linked list from string
    static Node buildLinkedList(String s) {
        Node head = null;
        Node tail = null;
        for (int i = 0; i < s.length(); i++) {
            Node newNode = new Node(s.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Reverse a linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        String input = "madam";
        Node head = buildLinkedList(input);

        // Find middle using fast and slow pointer
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // Compare both halves
        boolean isPalindrome = true;
        Node temp = secondHalf;
        while (temp != null) {
            if (firstHalf.data != temp.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}
