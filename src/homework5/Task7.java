package homework5;

import java.util.Scanner;

public class Task7 {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedMy(DoublyLinkedList list) {
        DoublyLinkedListNode current = list.head;
        while (current != null) {

            System.out.print(current.data + " ");

            current = current.next;
        }
        System.out.println();
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        DoublyLinkedListNode current = head;
        DoublyLinkedListNode temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            return temp.prev;
        } else {
            return null;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        DoublyLinkedList llist = new DoublyLinkedList();
        System.out.println("Введите количество вводных чисел:");
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Введите числа:");
        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            llist.insertNode(llistItem);
        }

        System.out.println("Стартовый список:");
        printDoublyLinkedMy(llist);
        DoublyLinkedListNode llist1 = reverse(llist.head);
        System.out.println("Реверс:");
        printDoublyLinkedList(llist1, " ");

        scanner.close();
    }
}
