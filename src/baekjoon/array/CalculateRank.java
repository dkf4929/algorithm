package baekjoon.array;

public class CalculateRank {
    public int[] solution(int[] scores) {
        int[] ranks = new int[scores.length];

        for (int i = 0; i < scores.length - 1; i++) {
            int rank = 1;

            for (int j = 1; j < scores.length; j++) {
                if (scores[i] < scores[j])
                    rank ++;
                else if (scores[i] > scores[j]) {
                    rank ++;
                }
            }

            ranks[i] = rank;
        }

        return ranks;
    }
}
