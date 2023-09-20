package day20;

public class ReverseLinkedList {
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

        System.out.println("Printing linked list before reversing");
        printLinkedList(n1);

        reverseLinkedList(n1);
    }

    public static void reverseLinkedList(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node currPlusOne = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currPlusOne;
        }
        head = prev;

        System.out.println("\nPrinting linked list after reversing");
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
