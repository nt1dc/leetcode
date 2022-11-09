package leetcode;

public class Reverse_Linked_List {

    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode currentNode = head;
            while (currentNode != null) {
                ListNode tmp = currentNode.next;
                currentNode.next = prev;
                prev = currentNode;
                currentNode = tmp;
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1, listNode2);
        Solution solution = new Solution();
        solution.reverseList(listNode1);
    }
}
