package baekjoon.dataStructure.mapTreeSet;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class MaxNumber {
    public int solution(int[] array, int k) {
        int answer = 0;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int l = j + 1; l < array.length; l++) {
                    treeSet.add(array[i] + array[j] + array[l]);
                }
            }
        }

        for (Integer n : treeSet) {
            answer++;

            if (answer == k) return n;
        }

        return answer;
    }
}
