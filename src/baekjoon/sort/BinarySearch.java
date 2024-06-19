package baekjoon.sort;

import java.util.Arrays;

public class BinarySearch {
    public int solution(int i, int[] array) {
        int n = array.length / 2;

        Arrays.sort(array);
        int k = -1;
        int len = -1;

        if (i > array[n]) {
            k = n;
            len = array.length;
        } else {
            k = 0;
            len = n;
        }


        while (k < len) {
            k ++;

            if (array[k] == i)
                return k + 1;
        }

        return 0;
    }
}
