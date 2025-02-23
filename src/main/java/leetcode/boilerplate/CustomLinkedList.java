package leetcode.boilerplate;

import java.util.Objects;

public class CustomLinkedList {

    public static class ListNode {
        public final int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;

    public void insertAtEnd(int val) {
        var newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
            return;
        }

        var temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void printList() {
        if (Objects.isNull(head)) {
            System.out.println("List is empty");
            return;
        }

        var temp = head;
        while (Objects.nonNull(temp.next)) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.val);
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        var temp = head;
        while (Objects.nonNull(temp.next)) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.val);
    }
}
