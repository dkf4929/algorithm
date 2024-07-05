package baekjoon.dfs;

import java.util.*;

public class FindMaxScore {
    static int n, limit, answer = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        limit = s.nextInt();

        int[] scoreArray = new int[n];
        int[] timeArray = new int[n];

        for (int i = 0; i < n; i++) {
            scoreArray[i] = s.nextInt();
            timeArray[i] = s.nextInt();
        }

        FindMaxScore findMaxScore = new FindMaxScore();
        findMaxScore.solution(0, 0, 0, scoreArray, timeArray);
        System.out.println(answer);
    }

    public void solution(int l, int score, int minute, int[] scoreArray, int[] timeArray) {
        if (minute > limit) return;

        if (l == n) {
            answer = Integer.max(answer, score);
        } else {
            solution(l + 1, score + scoreArray[l], minute + timeArray[l], scoreArray, timeArray);
            solution(l + 1, score, minute, scoreArray, timeArray);
        }
    }
}
