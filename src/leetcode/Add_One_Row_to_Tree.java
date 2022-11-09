//package leetcode;
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//
//public class Add_One_Row_to_Tree {
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    class Solution {
//        public TreeNode addOneRow(TreeNode root, int val, int depth) {
//            Queue<TreeNode> queue = new ArrayDeque<>();
//            queue.add(root);
//            while (!queue.isEmpty())
//                queue.poll();
//        }
//    }
//}
