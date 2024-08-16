package leetcode.easy;

import java.util.Objects;

@SuppressWarnings("all")
public class RemoveLinkedListElements {

    private static class ListNode {
        int val;
        ListNode next;
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        head.next = removeElements(head.next, val);
        if(head.val == val){
            return head.next;
        }
        return head;
    }

    public ListNode removeAllKeys(ListNode head, int key) {
        System.out.println("Removing All Keys: " + key);
        if (Objects.isNull(head)) {
            System.out.println("No Elements in the Linked List");
            return head;
        }

        // Case: Head Nodes Contains Key
        while (Objects.nonNull(head) && head.val == key) {
            var temp = head;
            head = head.next;
            temp.next = null;
        }

        if (Objects.isNull(head)) return head;

        // Case: Other Nodes Contains Key
        var slow = head;
        var fast = head.next;

        while (Objects.nonNull(fast)) {
            if (fast.val == key) {
                while (Objects.nonNull(fast) && fast.val == key) fast = fast.next;
                slow.next = fast;
            }

            if (Objects.nonNull(fast)) {
                slow = fast;
                fast = fast.next;
            }
        }

        return head;
    }
}
