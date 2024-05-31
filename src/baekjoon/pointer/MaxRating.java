package baekjoon.pointer;

public class MaxRating {
    public int solution(int n, int k, int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length - 2; i++) {
            int temp = 0;

            for (int j = i; j < i + k; j++) {
                temp += array[j];
            }

            answer = Math.max(answer, temp);
        }

        return answer;
    }
}
