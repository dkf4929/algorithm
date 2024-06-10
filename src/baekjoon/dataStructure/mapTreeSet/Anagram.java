package baekjoon.dataStructure.mapTreeSet;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public String solution(String first, String second) {
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : first.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : second.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c) - 1);
        }

        return answer;
    }
}
