public class Main {
    public static void main(String[] args) {
        /*
        EXAMPLE
        Input:3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
        Output:3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
        */
        Node head=new Node(3);
        head.appendToTail(5);
        head.appendToTail(8);
        head.appendToTail(5);
        head.appendToTail(10);
        head.appendToTail(2);
        head.appendToTail(1);
        head.printList();
        Node newHead=Partition.partition2(head, 5);
        newHead.printList();
    }
}
