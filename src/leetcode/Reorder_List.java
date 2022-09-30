package leetcode;

import java.util.ArrayList;

public class Reorder_List {
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

        public void reorderList(ListNode head) {
            ListNode right = head;
            ArrayList<ListNode> nodes = new ArrayList<>();
            while (right != null) {
                nodes.add(right);
                right = right.next;
            }
            for (int i = 0; i < nodes.size() / 2; i++) {
                ListNode tmp = nodes.get(i).next;
                nodes.get(i).next = nodes.get(nodes.size() - 1 - i);
                nodes.get(nodes.size() - 1 - i).next = tmp;
            }

            System.out.println("zxc");
        }
    }

    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(4, null);
        ListNode listNode3 = new ListNode(3, listNode4);

        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        Solution solution = new Solution();
        solution.reorderList(listNode1);
    }
}
