package baekjoon.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mischief {
    public List<Integer> solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        int[] temp = array.clone();
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != temp[i]) list.add(i + 1);
        }

        return list;
    }
}
