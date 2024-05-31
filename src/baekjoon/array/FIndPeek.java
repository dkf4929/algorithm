package baekjoon.array;

public class FIndPeek {
    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && arr[i][j] <= arr[i - 1][j])
                    continue;

                if (i < 4 && arr[i][j] <= arr[i + 1][j])
                    continue;

                if (j > 0 && arr[i][j] <= arr[i][j - 1])
                    continue;

                if (j < 4 && arr[i][j] <= arr[i][j + 1])
                    continue;

                answer ++;
            }
        }
        return answer;
    }
}
