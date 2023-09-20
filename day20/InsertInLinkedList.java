package day20;

public class InsertInLinkedList {
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

        System.out.println("Printing linked list before insertion");
        printLinkedList(n1);

        // Check one operation at a time
//        insertAtStart(n1, 60);
//        insertAtLast(n1, 70 );
//        insertAt(n1, 5, 80);
    }

    public static void insertAtStart(Node head, int v) {
        Node newNode = new Node(v);
        newNode.next = head;
        head = newNode;

        System.out.println("\nPrinting linked list after insertion at start");
        printLinkedList(head);
    }

    public static void insertAtLast(Node head, int v) {
        Node newNode = new Node(v);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        System.out.println("\nPrinting linked list after insertion at last");
        printLinkedList(head);
    }

    public static void insertAt(Node head, int k, int v) {
        if (k == 0) {
            insertAtStart(head, v);
            return;
        }
        Node newNode = new Node(v);
        Node temp = head;

        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        Node temp2 = temp.next;
        temp.next = newNode;
        newNode.next = temp2;

        System.out.println("\nPrinting linked list after insertion at index : " + k);
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
