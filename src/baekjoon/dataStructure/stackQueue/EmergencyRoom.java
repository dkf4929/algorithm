package baekjoon.dataStructure.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyRoom {
    public int solution(int[] warning, int n) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i : warning) {
            queue.add(i);
        }
        return answer;
    }
}
