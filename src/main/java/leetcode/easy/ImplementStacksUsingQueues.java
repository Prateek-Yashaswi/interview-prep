package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStacksUsingQueues {

    private final Queue<Integer> primary;

    public ImplementStacksUsingQueues() {
        this.primary = new LinkedList<>();
    }

    public void push(int x) {
        var secondary = new LinkedList<Integer>();
        while (!primary.isEmpty()) {
            secondary.offer(primary.poll());
        }

        primary.offer(x);
        while (!secondary.isEmpty()){
            primary.offer(secondary.poll());
        }
    }

    public int pop() {
        if (primary.isEmpty()) throw new RuntimeException("No Element in stack");
        return primary.poll();
    }

    public int top() {
        if (primary.isEmpty()) throw new RuntimeException("No Element in stack");
        return primary.peek();
    }

    public boolean empty() {
        return primary.isEmpty();
    }

    public static void main(String[] args) {
        var stack = new ImplementStacksUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.empty());
    }
}
