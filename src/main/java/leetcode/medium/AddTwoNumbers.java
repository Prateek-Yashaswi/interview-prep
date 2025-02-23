package leetcode.medium;


import leetcode.boilerplate.CustomLinkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {
        var l1 = new CustomLinkedList();
        var l2 = new CustomLinkedList();

        l1.insertAtEnd(2);
        l1.insertAtEnd(4);
        l1.insertAtEnd(3);

        l2.insertAtEnd(5);
        l2.insertAtEnd(6);
        l2.insertAtEnd(4);

        var res = solve(l1.head, l2.head);
        CustomLinkedList.printList(res);
    }

    private static CustomLinkedList.ListNode solve(CustomLinkedList.ListNode l1, CustomLinkedList.ListNode l2) {
        var head = new CustomLinkedList.ListNode(0);
        var current = head;
        var carry = 0;

        var pointerL1 = l1;
        var pointerL2 = l2;

        while (pointerL1 != null || pointerL2 != null) {
            var currentL1 = 0;
            var currentL2 = 0;

            if (pointerL1 != null) {
                currentL1 = pointerL1.val;
                pointerL1 = pointerL1.next;
            }

            if (pointerL2 != null) {
                currentL2 = pointerL2.val;
                pointerL2 = pointerL2.next;
            }

            var sum = currentL1 + currentL2 + carry;
            carry = sum / 10;

            current.next = new CustomLinkedList.ListNode(sum % 10);
            current = current.next;
        }

        if (carry > 0) {
            current.next = new CustomLinkedList.ListNode(carry);
        }

        return head.next;
    }
}
