package leetcode;

//203. Remove Linked List Elements
//https://leetcode.com/problems/remove-linked-list-elements/
public class Remove_Linked_List_Elements {
    public class ListNode {
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

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(-1,head);
            ListNode current = head;
            ListNode prev = dummy;
            while (current!=null){
                if (current.val == val)prev.next=current.next;
                else prev=current;
                current=current.next;

            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {


    }
}
