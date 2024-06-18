package baekjoon.dataStructure.stackQueue;

import java.util.Stack;

public class Stick {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                stack.push(('('));
            else {
                stack.pop();
                if (str.charAt(i-1) == '(') answer += stack.size();
                else answer ++;
            }
        }

        return answer;
    }
}
