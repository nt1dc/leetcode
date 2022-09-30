package leetcode;

import java.util.HashSet;

public class Linked_List_Cycle_II {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static public class Solution {
        public ListNode detectCycle(ListNode head) {
            HashSet<ListNode> set = new HashSet();
            ListNode current = head;
            while (current != null) {
                if (set.contains(current.next)) {
                    return current.next;
                }
                set.add(current);
                current = current.next;
            }
            return null;
        }

    }


    public static void main(String[] args) {

    }
}
