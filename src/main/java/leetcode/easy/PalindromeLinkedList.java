package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    private static class ListNode {
        int val;
        ListNode next;
    }

    private static boolean solve(ListNode head) {
        if (head == null) return true;

        ListNode slow = head, fast = head;

        List<Integer> itemsVisitedBySlow = new ArrayList<>();

        while (fast != null && fast.next != null) {
            itemsVisitedBySlow.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the list has an odd number of elements, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        int index = itemsVisitedBySlow.size() - 1;

        while (slow != null) {
            if (itemsVisitedBySlow.get(index) != slow.val) return false;
            slow = slow.next;
            index--;
        }

        return true;
    }
}
