package baekjoon.array;

public class Mentoring {
    public int solution(int n, int m, int[][] array) {
        int answer = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                int cnt = 0;

                for (int k = 0; k < array.length; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < array[k].length; s++) {
                        if (array[k][s] == i) pi = s;
                        if (array[k][s] == j) pj = s;
                    }

                    if (pi < pj) cnt ++;
                    else continue;
                }

                if (cnt == n) answer++;
            }
        }

        return answer;
    }
}
