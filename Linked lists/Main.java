public class Main {
    public static void main(String[] args) {

       Node head1=new Node(1);
       head1.appendToTail(2);
       head1.appendToTail(3);
       head1.appendToTail(4);
       head1.printList();
       Node head=Intersection.doIntersect(head1,head1);
       head.printList();
    }
}
