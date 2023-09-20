package day20;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
//        Node n6 = new Node(60);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
//        n5.next = n6;

        Node result = findMiddleNode(n1);
        System.out.println(result.val);
    }

    public static Node findMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

//    O(N)
//    public static void findMiddleNode(Node head) {
//        int mid = (countElements(head) / 2) + 1;
//        Node temp = head;
//
//        for (int i = 1; i < mid; i++) {
//            temp = temp.next;
//        }
//        System.out.println(temp.val);
//    }
//
//    public static int countElements(Node head) {
//        int count = 0;
//
//        Node temp = head;
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }
}
