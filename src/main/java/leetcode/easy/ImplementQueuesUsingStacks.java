package leetcode.easy;

import java.util.Stack;

@SuppressWarnings("all")
public class ImplementQueuesUsingStacks {

    private static class MyQueue {
        private Stack<Integer> stack;

        public MyQueue() {
            stack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
        }

        public int pop() {
            var temp = new Stack<Integer>();

            while (!stack.isEmpty()) {
                temp.push(stack.pop());
            }

            var removed = temp.pop();

            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }

            return removed;
        }

        public int peek() {
            var temp = new Stack<Integer>();

            while (!stack.isEmpty()) {
                temp.push(stack.pop());
            }

            var res = temp.peek();

            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }

            return res;
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
