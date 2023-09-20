package day20;

public class DeleteInLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("Printing linked list before deletion");
        printLinkedList(n1);

        // Check one operation at a time
//        deleteAtStart(n1);
//        deleteAtLast(n1);
//        deleteAt(n1, 3);
    }

    public static void deleteAtStart(Node head) {
        Node temp = head;
        temp = temp.next;

        System.out.println("\nPrinting linked list after deletion at start");
        printLinkedList(temp);
    }

    public static void deleteAtLast(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        System.out.println("\nPrinting linked list after deletion at last");
        printLinkedList(head);
    }

    public static void deleteAt(Node head, int x) {
        if (x == 0) {
            deleteAtStart(head);
            return;
        }
        Node temp = head;

        for (int i = 1; i < x - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        System.out.println("\nPrinting linked list after deletion at index : " + x);
        printLinkedList(head);
    }

    public static void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
