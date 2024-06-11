package baekjoon.dataStructure.stackQueue;

import java.util.Stack;

public class ParenthesesWordRemove {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.empty()) {
                stack.add(c);
                continue;
            }

            if (c == ')') {
                int index = stack.lastIndexOf('(');

                for (int i = stack.size(); i > index; i--) {
                    stack.pop();
                }
            } else
                stack.push(c);
        }

        for (Character character : stack) sb.append(character);

        return sb.toString();
    }
}
