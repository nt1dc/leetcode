package leetcode;

public class Merge_Two_Sorted_Lists {

    //  Definition for singly-linked list.
    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode();
            ListNode head = new ListNode();
            dummy.next = head;
            ListNode current1 = list1;
            ListNode current2 = list2;
            while (current1 != null && current2 != null) {
                if (current1.val < current2.val) {
                    head.next = current1;
                    current1 = current1.next;
                } else {
                    head.next = current2;
                    current2 = current2.next;
                }
                head = head.next;
            }
            while (current1 != null) {
                head.next = current1;
                current1 = current1.next;
                head=head.next;
            }
            while (current2 != null) {
                head.next = current2;
                current2 = current2.next;
                head=head.next;
            }
            return dummy.next.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(3);
        ListNode listNode1 = new ListNode(-9, listNode2);

        ListNode listNode4 = new ListNode(7);
        ListNode listNode3 = new ListNode(5, listNode4);

        Solution solution = new Solution();
        solution.mergeTwoLists(listNode1,listNode3);

    }
}
