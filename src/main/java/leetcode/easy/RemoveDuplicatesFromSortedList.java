package leetcode.easy;

import java.util.Objects;

public class RemoveDuplicatesFromSortedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode head = insert(null, 1);
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 3);

        solve(head);
        printList(head);
    }

    //  1 1 2 3 3
    private static void solve(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            ListNode slow = temp;
            int curr = slow.val;

            while (temp.val == curr) {
                temp = temp.next;
                if (temp == null) break;
            }

            slow.next = temp;
        }
    }

    private static ListNode insert(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (Objects.isNull(head))
            head = newNode;
        else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        return head;
    }

    private static void printList(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.print(temp.val);
        System.out.println();
    }
}
