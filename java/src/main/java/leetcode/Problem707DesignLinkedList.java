package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/design-linked-list/
 * https://leetcode.com/explore/learn/card/linked-list/209/singly-linked-list/1290/
 */
@SuppressWarnings("ClassCanBeStatic") // Leetcode is not static
public final class Problem707DesignLinkedList {
    public class MyLinkedList {

        private ListNode head;
        private int size;

        public int get(int index) {
            if (index >= size || index < 0) {
                return -1;
            }

            ListNode temp = head;
            while (index > 0) {
                temp = temp.next;
                index--;
            }
            return temp.val;
        }

        public void addAtHead(int val) {
            ListNode newHead = new ListNode(val);
            newHead.next = head;
            head = newHead;

            size++;
        }

        public void addAtTail(int val) {
            ListNode newTail = new ListNode(val);
            if (head == null) {
                head = newTail;
            }

            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTail;

            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index > size) {
                return;
            }

            if (index == size) {
                addAtTail(val);
                return;
            }

            if (index <= 0) {
                addAtHead(val);
                return;
            }

            ListNode temp = head;
            index--;

            while (index > 0) {
                temp = temp.next;
                index--;
            }

            ListNode newNode = new ListNode(val);
            newNode.next = temp.next;
            temp.next = newNode;

            size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }

            if (head == null) {
                return;
            }

            if (index == 0) {
                head = head.next;
            }

            if (head == null) {
                return;
            }

            ListNode previous = head;
            ListNode current = head.next;
            index--;

            while (index > 0 && current != null) {
                previous = current;
                current = current.next;
                index--;
            }

            if (current != null) {
                previous.next = current.next;
            }

            size--;
        }
    }
}
