package leetcode;

public class Remove_Nth_Node_From_End_of_List {
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode current = head;
            int counter = n ;
            ListNode connect = null;
            while (current.next != null) {

                if (counter == 0) {
                    connect = head;
                }
                if (connect != null) {
                    connect = connect.next;
                }
                current = current.next;
                counter--;
            }
            connect.next=connect.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node4 = new ListNode(5, null);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        solution.removeNthFromEnd(head, 2);
    }
}
