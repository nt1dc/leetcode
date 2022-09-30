package leetcode;

public class Add_Two_Numbers {
    static public class ListNode {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int perenos = 0;
            ListNode dummyHead = new ListNode();
            ListNode temp = dummyHead;
            while (l1 != null || l2 != null ||perenos!=0) {
                int sum = 0;

                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                sum += perenos;
                int val = sum % 10;
                perenos = sum / 10;

                ListNode node = new ListNode(val);
                temp.next = node;
                temp = temp.next;
            }
            return dummyHead.next;
        }
    }

    public static void main(String[] args) {

    }
}
