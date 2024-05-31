package baekjoon.pointer;

public class ConsecutiveNumberSequence {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        int p = 0;

        for (int i = 0; i < n; i++) {
            if (sum <= k) sum += arr[i];

            while (sum > k) {
                sum -= arr[p];
                p++;
            }

            if (sum == k)
                answer ++;
        }

        return answer;
    }
}
