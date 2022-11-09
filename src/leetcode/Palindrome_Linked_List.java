package leetcode;

public class Palindrome_Linked_List {
    static class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return true;

            ListNode reversed = null;
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            while (slow != null) {
                ListNode next = slow.next;
                slow.next = reversed;
                reversed = slow;
                slow = next;
            }

            while (reversed != null) {
                if (head.val != reversed.val) return false;
                head = head.next;
                reversed = reversed.next;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        solution.isPalindrome(listNode);
    }
}
