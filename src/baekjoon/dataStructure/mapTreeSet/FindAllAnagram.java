package baekjoon.dataStructure.mapTreeSet;

import java.util.HashMap;
import java.util.Map;

public class FindAllAnagram {
    public int solution(String std, String findStr) {
        int answer = 0;
        int lt = 0;
        int rt = findStr.length() - 1;

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> findMap = new HashMap<>();

        char[] stdCharArray = std.toCharArray();
        char[] findCharArray = findStr.toCharArray();

        for (int i = 0; i < findCharArray.length; i++) {
            map.put(stdCharArray[i], map.getOrDefault(stdCharArray[i], 0) + 1);
            findMap.put(findCharArray[i], findMap.getOrDefault(findCharArray[i], 0) + 1);
        }

        while (true) {
            if (map.equals(findMap)) answer ++;

            if (map.containsKey(stdCharArray[lt]) && map.get(stdCharArray[lt]) > 1)
                map.replace(stdCharArray[lt], map.get(stdCharArray[lt]) - 1);
            else
                map.remove(stdCharArray[lt]);

            lt ++;
            rt ++;

            if (rt > stdCharArray.length - 1) break;

            if (map.containsKey(stdCharArray[rt]))
                map.replace(stdCharArray[rt], map.get(stdCharArray[rt]) + 1);
            else
                map.put(stdCharArray[rt], 1);
        }

        return answer;
    }
}
