public class Symmetric_Tree {
    static public class TreeNode {
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

    static class Solution {
        public boolean compareNodes(TreeNode leftNode, TreeNode rightNode) {
            if (rightNode == null || leftNode == null) return rightNode == leftNode;
            if (rightNode.val != leftNode.val) return false;
            return compareNodes(leftNode.left, rightNode.right) && compareNodes(leftNode.right, rightNode.left);
        }

        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return compareNodes(root.left, root.right);
        }
    }

    public static void main(String[] args) {

    }
}
