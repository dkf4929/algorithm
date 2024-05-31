package baekjoon.pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElement {
    public int[] solution(int n, int[] arr1, int m, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;

        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1 ++;
                p2 ++;
            } else if (arr1[p1] > arr1[p2]) {
                p2 ++;
            } else {
                p1 ++;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
