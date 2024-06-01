package leetcode.medium;

public class RemoveNthNodeFromEndOfList {
    private static class ListNode {
        ListNode next;
    }

    private ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode fast = head;
        int flag = 0;

        while (flag != n) {
            fast = fast.next;
            flag++;
        }

        if (fast == null) return head.next;

        ListNode slow = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
