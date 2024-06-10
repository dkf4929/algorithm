package baekjoon.dataStructure.mapTreeSet;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ClassPresident {
    public char solution(String result) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : result.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map.keySet().stream()
                .max(Comparator.comparingInt(key -> map.get(key)))
                .get();
    }
}
