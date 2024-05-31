package baekjoon.pointer;

public class CombinedArray {
    public int[] solution(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length + arr2.length];

        int max = Math.max(arr1.length, arr2.length);

        int i = 0, j = 0, p = 0;

        while (i < max && j < max) {
            if (i == arr1.length) {
                answer[p] = arr2[j];
                j++;
            }
            else if (j == arr2.length) {
                answer[p] = arr1[i];
                i++;
            }
            else if (arr1[i] < arr2[j]) {
                answer[p] = arr1[i];
                i++;
            } else {
                answer[p] = arr2[j];
                j++;
            }

            p ++;
        }

        return answer;
    }
}
