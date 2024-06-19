package baekjoon.sort;

import java.util.Arrays;

public class Stall {
    public int solution(int n, int[] arr) {
        Arrays.sort(arr);
        int answer = 0;

        int lt = 1;
        int rt = arr[n-1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= n) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }

        return answer;
    }

    private int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt ++;
                ep = arr[i];
            }
        }

        return cnt;
    }
}
