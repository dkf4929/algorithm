package baekjoon.dataStructure.mapTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Revenue {
    public List<Integer> solution(int[] array, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i <= array.length - n; i++) {
            Map<Integer, Character> map = new HashMap<>();

            for (int j = i; j < i + n; j++) {
                map.put(array[j], 'A');
            }

            answer.add(map.size());
        }

        return answer;
    }
}
