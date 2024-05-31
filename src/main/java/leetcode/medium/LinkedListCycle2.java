package leetcode.medium;

public class LinkedListCycle2 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Detect Cycle - Floyd's tortoise and hare algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Find Start of the cycle
            if (slow == fast) {
                ListNode start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }

                return start; // The start of the cycle
            }
        }

        return null;
    }
}
