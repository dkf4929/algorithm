package baekjoon.sort;

import java.util.ArrayList;
import java.util.List;

public class LeastRecentlyUsed {
    public int[] solution(int n, int[] array) {
        int[] arr = new int[n];

        for (int i = 0; i < array.length; i++) {
            boolean isExist = false;
            int idx = 0;

            for (int j = 0; j < arr.length; j++) {
                if (array[i] == arr[j]) {
                    isExist = true;
                    idx = j;
                }
            }

            if (isExist) {
                int temp = arr[idx];
                for (int k = idx; k >= 1; k--) {
                    arr[k] = arr[k-1];
                }

                arr[0] = temp;
            } else {
                for (int k = arr.length - 1; k >= 1; k--) {
                    arr[k] = arr[k - 1];
                }

                arr[0] = array[i];
            }
        }

        return arr;
    }
}
