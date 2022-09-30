package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Level_Order_Traversal {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            ArrayList<List<Integer>> ans = new ArrayList<>();
            help(root, ans, 0);
            return ans;
        }

        private void help(TreeNode node, ArrayList<List<Integer>> list, int rang) {
            if (node == null) return;
            if (list.size() <= rang) {
                list.add(new ArrayList<>());
            }
            list.get(rang).add(node.val);
            int currentRang = rang + 1;
            help(node.left, list, currentRang);
            help(node.right, list, currentRang);
        }
    }
}
