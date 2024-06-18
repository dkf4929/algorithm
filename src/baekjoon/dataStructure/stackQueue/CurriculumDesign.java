package baekjoon.dataStructure.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class CurriculumDesign {
    public String solution(String essential, String curriculum) {
        Queue<Character> queue = new LinkedList<>();

        for (char c : essential.toCharArray()) {
            queue.add(c);
        }

        for (char c : curriculum.toCharArray()) {
            if (!queue.isEmpty() && c == queue.peek())
                queue.poll();
        }

        return queue.isEmpty() ? "YES" : "NO";
    }
}
