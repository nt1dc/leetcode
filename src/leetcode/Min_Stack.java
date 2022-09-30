package leetcode;

import java.util.Stack;

public class Min_Stack {
    class MinStack {
        Stack<Integer> stack = new Stack();
        Stack<Integer> minStack = new Stack();

        public MinStack() {

        }

        public void push(int val) {
            stack.push(val);
            if (!minStack.empty()) {
                if (val < minStack.peek()) {
                    minStack.push(val);
                } else minStack.push(minStack.peek());
            }
        }

        public void pop() {
            minStack.pop();
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
