package baekjoon.sort;

import java.util.Arrays;

public class MusicVideo {
    public int solution(int n, int[] array) {
        int answer = 0;

        int lt = Arrays.stream(array).max().getAsInt();
        int rt = Arrays.stream(array).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (getCount(array, mid) <= n) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }

        return answer;
    }

    private int getCount(int[] array, int capacity) {
        int cnt = 1;
        int sum = 0;

        for (int i : array) {
            if (sum + i > capacity) {
                cnt ++;
                sum = i;
            } else sum += i;
        }

        return cnt;
    }
}
