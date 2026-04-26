public class Main {
    public static void main(String[] args) {
        Node head=new Node(0);
        head.appendToTail(0);
        head.appendToTail(1);
        head.appendToTail(0);
        head.appendToTail(2);
        head.printList();
        RemoveDups.removeDupsNoBuffer(head);
        head.printList();
    }
}
