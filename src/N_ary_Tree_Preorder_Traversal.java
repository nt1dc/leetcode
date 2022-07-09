import java.util.ArrayList;
import java.util.List;

public class N_ary_Tree_Preorder_Traversal {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    static class Solution {
        public List<Integer> preorder(Node root) {
            List<Integer> ans = new ArrayList<>();
            if (root==null)return ans;
            help(root, ans);
            return ans;
        }

        public void help(Node node, List<Integer> ans) {
            ans.add(node.val);
            for (Node n : node.children
            ) {
                help(n, ans);
            }
        }
    }

    public static void main(String[] args) {

    }
}
