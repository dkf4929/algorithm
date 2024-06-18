package baekjoon.sort;

public class SelectionSort {
    public int[] solution(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int idx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[idx] > array[j]) idx = j;
            }

            int temp = array[i];
            array[i] = array[idx];
            array[idx] = temp;
        }

        return array;
    }
}
