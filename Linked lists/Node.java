public class Node {
    Node next=null;
    int data;

    public Node(int d){
        data=d;
    }

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next!=null){
            n=n.next;
        }
        n.next=end;
    }

    void printList(){
        Node n = this;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }

    Node deleteNode(Node head, int d){
        Node n = head;
        if(n.data==d){
            return head.next;
        }
        while(n.next!=null){
            if(n.next.data==d){
                n.next=n.next.next;
                return head;
            }
            n=n.next;
        }
        return head;
    }

}
