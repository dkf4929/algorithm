package baekjoon.dfs;

import java.util.Map;
import java.util.Scanner;

public class RideBaduk {
    static int max, n, answer = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        max = s.nextInt();
        n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        RideBaduk rideBaduk = new RideBaduk();
        rideBaduk.solution(0, 0, arr);
        System.out.println(answer);
    }

    public void solution(int l, int sum, int[] arr) {
        if (sum > max) return;

        if (l == n) {
            answer = Math.max(answer, sum);
        } else {
            solution(l+1, sum + arr[l], arr);
            solution(l+1, sum, arr);
        }
    }
}
