public class Main {
    public static void main(String[] args) {
        /*
        Input:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
        Output: 9 -> 1 -> 2. That is, 912.
        */
       Node head1=new Node(1);
       head1.appendToTail(2);
       head1.appendToTail(3);
       head1.appendToTail(4);
       head1.printList();
       Node head=Palindrome.reverseAndCloneList(head1);
       head.printList();
    }
}
