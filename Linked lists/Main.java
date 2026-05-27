public class Main {
    public static void main(String[] args) {
        /*
        Input:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
        Output: 9 -> 1 -> 2. That is, 912.
        */
       Node head1=new Node(6),head2=new Node(2);
       head1.appendToTail(1);
       head2.appendToTail(9);
       head1.appendToTail(7);
       head2.appendToTail(5);
       head1.printList();
       head2.printList();
       Node head3=SumLists.sumLists5(head1, head2);
       head3.printList();
    }
}
