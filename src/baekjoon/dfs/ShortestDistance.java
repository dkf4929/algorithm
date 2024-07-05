package baekjoon.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistance {
    class Node {
        int data;
        Node lt, rt;
        public Node(int value) {
            data = value;
            lt = rt = null;
        }
    }

    public int solution() {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        int answer = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                Node node = queue.poll();

                if (node.lt == null && node.rt == null) return answer;
                if (node.lt != null) queue.add(node.lt);
                if (node.rt != null) queue.add(node.rt);
            }
            answer ++;
        }

        return 0;
    }
}
