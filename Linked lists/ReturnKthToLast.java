public class ReturnKthToLast {
    /*
        Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
        - two loops
        - count the number of elements
        - reach n-k, return.
    */
    public static Node getKthToLast(Node head,int k){
        int n=0;
        Node currNode=head;
        while (currNode != null){
            currNode=currNode.next;
            n++;
        } 
        if (k>n || k<=0) return null;
        currNode=head;
        for (int i=0; i<n-k;i++){
            currNode=currNode.next;
        }
        return currNode;
    }
    //One pass
     public static Node getKthToLast1(Node head,int k){
        if (k<=0) return null;
        Node p1=head,p2=head;
        for (int i=0;i<k;i++){
            if (p2 == null) return null;
            p2=p2.next;
        }
        while (p2 != null){
            p2=p2.next;
            p1=p1.next;
        }
        return p1;
    }
}
