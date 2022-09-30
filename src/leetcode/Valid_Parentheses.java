package leetcode;

import java.util.Stack;

public class Valid_Parentheses {
    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (stack.empty()) {
                    stack.add(s.charAt(i));
                } else {
                    char top = stack.peek();
                    if ((top=='('&&s.charAt(i)==')')||(top=='{'&&s.charAt(i)=='}')||(top=='['&&s.charAt(i)==']')) {
                        stack.pop();
                    } else stack.add(s.charAt(i));
                }
            }
            return stack.empty();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()[]{}"));
    }
}
