package leetcode;

import java.util.Objects;

public class MergeTwoSortedLists {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = insert(null, 1);
        head1 = insert(head1, 2);
        head1 = insert(head1, 4);

        System.out.print("SORTED LIST 1: ");
        printList(head1);

        ListNode head2 = insert(null, 1);
        head2 = insert(head2, 3);
        head2 = insert(head2, 4);

        System.out.print("SORTED LIST 2: ");
        printList(head2);

        System.out.println("\nSORTED MERGED LIST: ");
        head1 = mergeTwoLists(head1, head2);
        printList(head1);

    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode(0);
        ListNode current = newList;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }


        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return newList.next;
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
