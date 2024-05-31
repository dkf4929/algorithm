package baekjoon.pointer;

public class ConsecutiveSum {
    public int solution(int n) {
        int answer = 0;

        int sum = 0;
        int p = 1;

        for (int i = 1; i < n - 1; i++) {
            sum += i;

            if (sum == n) answer ++;

            while (sum >= n) {
                sum -= p;
                p++;

                if (sum == n) answer++;
            }
        }

        return answer;
    }
}
