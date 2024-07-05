package baekjoon.dfs;

import java.util.Scanner;

public class CoinExchange {
    static int n, coin, answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        coin = scanner.nextInt();

        CoinExchange coinExchange = new CoinExchange();
        coinExchange.solution(0, 0, arr);
        System.out.println(answer);
    }

    public void solution(int l, int sum, int[] arr) {
        if (sum == coin) {
            answer = Math.min(answer, l);
        } else if(sum > coin) return;
        else {
            for (int i = 0; i < n; i++) {
                solution(l + 1, sum + arr[i], arr);
            }
        }
    }
}
