package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode temp = head;

        List<ListNode> visited = new ArrayList<>();

        while (temp.next != null) {
            if (visited.contains(temp.next))
                return true;

            visited.add(temp);
            temp = temp.next;
        }

        return false;
    }

    private boolean floydsTortoiseAndHareAlgorithm (ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;

            return false;
        }

        return true;
    }
}
