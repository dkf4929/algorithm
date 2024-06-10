package baekjoon.pointer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxLengthSequence {
    public int solution(int n, int k, int[] arr) {
        int p = 0; // 가장 마지막 0 위치
        int answer = 0; // 연속된 1 갯수
        int temp = k; // 몇번 바꿨는지
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) answer ++;

            if (arr[i] == 0) {
                if (temp == 0) {
                    list.add(answer);
                    temp = k;
                    answer = 0;
                    i = p;
                } else {
                    temp --;
                    p = i;
                    answer ++;
                }
            }
        }

        list.stream().sorted(Comparator.reverseOrder());

        return list.get(0);
    }
}
