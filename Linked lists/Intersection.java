public class Intersection {

    /*

    Y -> A -> B -> C -> D
    E -> F-> A -> B -> C -> D

    */ 
    
    public static Node doIntersect(Node head1, Node head2){
        Node currentNode1=head1, currentNode2=head2;
        while (currentNode1 != null) {
            while (currentNode2 != null){
                if (currentNode1 == currentNode2) return currentNode1;
                currentNode2 = currentNode2.next;
            }
            currentNode1 = currentNode1.next;
        }
        return null;
    }

    public static Node doIntersect2(Node head1, Node head2){
        Node currentNode1=head1, currentNode2=head2;
        int n1=0,n2=0;
        while (currentNode1 != null){
            n1++;
            currentNode1 = currentNode1.next;
        }
        while (currentNode2 != null){
            n2++;
            currentNode2 = currentNode2.next;
        }
        if (currentNode1 != currentNode2) return null;

        currentNode1 = head1;
        currentNode2 = head2;

        if (n1 > n2){
            while (n1-n2 != 0){
                currentNode1 = currentNode1.next;
                n1--;
            }
        } else if (n2 > n1){
            while (n2-n1 != 0){
                currentNode2 = currentNode2.next;
                n2--;
            }
        }

       
        while (currentNode1 != currentNode2){
            currentNode1 = currentNode1.next;
            currentNode2 = currentNode2.next;
        }

        return currentNode1;
    }

}
