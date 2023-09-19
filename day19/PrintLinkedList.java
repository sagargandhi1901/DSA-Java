package day19;

class Node {
    int val;
    Node next;

    Node (int v) {
        val = v;
    }
}

public class PrintLinkedList {
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

        printLinkedList(n1);
    }

    public static void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
