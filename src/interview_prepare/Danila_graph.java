package interview_prepare;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Danila_graph {
    List<Integer> upperLvlSum = new ArrayList<>();

    class Solution {
        Node root = new Node(0, 1);

        void getSum(int lvl) {
        }

    }
    class Node {
        void dfs(Node node) {
            Queue<Node> nodeQueue = new ArrayDeque<>();
            nodeQueue.add(node);
            while (!nodeQueue.isEmpty()) {

                Node poll = nodeQueue.poll();
                if (!poll.visited) {
                    poll.visited = true;
                    System.out.println(poll.val);
                    nodeQueue.addAll(node.nodes);
                }
            }
        }

        int lvl;
        int val;
        boolean visited;
        List<Node> nodes = new ArrayList<>();

        public Node(int lvl, int val) {
            this.lvl = lvl;
            this.val = val;
        }
    }
}
