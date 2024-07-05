package baekjoon.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class SubnetSum {
    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }
        solution(0, 0, arr);
        System.out.println(answer);
    }

    public static void solution(int l, int sum, int[] array) {
        if (flag) return;
        if(sum > total / 2) return;
        if (l == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            solution(l + 1, sum + array[l], array);
            solution(l + 1, sum, array);
        }
    }
}
