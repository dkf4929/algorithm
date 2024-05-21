package baekjoon.string;

public class StringPassword {
    public String solution(String password) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            String tmp = password.substring(0, 7).replace("#","1").replace("*","0");
            int num = Integer.parseInt(tmp, 2);
            answer.append((char) num);
            password = password.substring(7);
        }

        return answer.toString();
    }
}
