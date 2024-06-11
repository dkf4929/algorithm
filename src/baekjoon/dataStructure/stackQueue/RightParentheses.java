package baekjoon.dataStructure.stackQueue;

import java.util.Collections;
import java.util.Stack;

public class RightParentheses {
    public String solution(String s) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' && !stack.empty() && stack.peek().equals(')'))
                stack.pop();
            else if (c == ')' && !stack.empty() && stack.peek().equals('('))
                stack.pop();
            else
                stack.push(c);
        }

        if (!stack.empty()) answer = "NO";

        return answer;
    }
}
