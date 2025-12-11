package org.example;

import java.util.Stack;

public class Solution2 {
    public String removeDuplicateLetters(String s) {
        if (s == null || s.isEmpty()) return "";


        boolean[] visited = new boolean[26];
        int[] lastOccurrence = new int[26];


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            lastOccurrence[c - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';

            // 如果字符已经在结果中，跳过
            if (visited[index]) {
                continue;
            }

            // 修正3: 正确的单调栈逻辑
            while (!stack.isEmpty() &&
                    c < stack.peek() &&
                    i < lastOccurrence[stack.peek() - 'a']) {
                char removed = stack.pop();
                visited[removed - 'a'] = false;
            }

            stack.push(c);
            visited[index] = true;
        }

        // 构建结果字符串
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}