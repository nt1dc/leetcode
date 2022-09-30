package leetcode;

import java.util.ArrayList;

public class Middle_of_the_Linked_List {
    static class ListNode {
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
        public ListNode middleNode(ListNode head) {
            ArrayList<ListNode> arrayList = new ArrayList();
            ListNode current = head;
            while (current != null) {
                arrayList.add(current);
                current = current.next;
            }
            return arrayList.get(arrayList.size() / 2);
        }
    }

    public static void main(String[] args) {

    }
}
