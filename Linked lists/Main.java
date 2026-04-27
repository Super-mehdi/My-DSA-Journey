public class Main {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.printList();
        Node result=ReturnKthToLast.getKthToLast1(head, 2);
        System.out.println(result.data);
    }
}
