public class Partition {
    /*
        Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
        before all nodes >= x. If x is contained within the list, the values of x only need
        to be after the elements less than x (see below). The partition element x can appear anywhere in the
        "right partition"; it does not need to appear between the left and right partitions.
        EXAMPLE
        Input:3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
        Output:3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
    */


    public static Node partition(Node head, int val){
        Node leftHead=null,leftTail=null;
        Node rightHead=null,rightTail=null;
        while (head != null){
            Node next=head.next;
            head.next=null;
            if (head.data < val){
                if (leftHead == null){
                    leftHead=head;
                    leftTail=leftHead;
                } else {
                    leftTail.next=head;
                    leftTail=head;
                }
            } else {
                if (rightHead == null){
                    rightHead=head;
                    rightTail=rightHead;
                } else {
                    rightTail.next=head;
                    rightTail=head;
                }
            }
            head=next;
        }
        if (leftHead == null) return rightHead;
        leftTail.next=rightHead;
        return leftHead;
    }

    public static Node partition2(Node head, int val){
        Node newHead=head;
        Node newTail=head;
        while (head != null){
            Node next=head.next;
            if ( head.data<val ){
                head.next=newHead;
                newHead = head;
            } else {
                newTail.next = head;
                newTail = head;
            }
            head=next;
        }
        newTail.next=null;
        return newHead;
    }
    

    
}