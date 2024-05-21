package baekjoon.array;

public class Student {
    public int solution(int[] students) {
        int answer = 0;
        int highestStudent = 0;

        for (int student : students) {
            if (student > highestStudent) {
                answer ++;
                highestStudent = student;
            }
        }

        return answer;
    }
}
