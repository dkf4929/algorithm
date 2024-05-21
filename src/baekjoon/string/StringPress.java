package baekjoon.string;

public class StringPress {
    public String solution(String str) {
        int cnt = 1;
        str += " ";
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                cnt ++;
            else {
                answer.append(str.charAt(i));
                if (cnt > 1) answer.append(String.valueOf(cnt));
                cnt = 1;
            }
        }

        return answer.toString();
    }
}
