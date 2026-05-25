public class Main {
    public static void main(String[] args) {
        /*
            (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295 = 912
            Output: 2 -> 1 -> 9. That is, 912.
        */
       Node head1=new Node(7),head2=new Node(5);
       head1.appendToTail(1);
       head2.appendToTail(9);
       head1.appendToTail(6);
       head2.appendToTail(2);
       head1.printList();
       head2.printList();
       Node head3=SumLists.sumLists2(head1, head2);
       head3.printList();
    }
}
