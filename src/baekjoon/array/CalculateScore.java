package baekjoon.array;

public class CalculateScore {
    public int solution(int[] array) {
        int answer = 0;
        int accumulate = 1;

        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i - 1] > 0 && array[i] > 0) {
                accumulate ++;
                answer += accumulate;
            } else {
                accumulate = 1;
                answer += array[i];
            }
        }

        return answer;
    }
}
