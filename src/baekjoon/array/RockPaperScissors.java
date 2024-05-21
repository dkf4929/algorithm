package baekjoon.array;

public class RockPaperScissors {
    public String[] solution(int[] A, int[] B) {
        String[] result = new String[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) result[i] = "D";
            else if (A[i] == 1 && B[i] == 3 || A[i] == 2 && B[i] == 1 || A[i] == 3 && B[i] == 2)
                result[i] = "A";
            else
                result[i] = "B";

        }

        return result;
    }
}
