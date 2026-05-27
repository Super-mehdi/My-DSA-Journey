public class SumLists {
    /*
        Sum Lists: You have two numbers represented by a linked list, where each node contains a single
        digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
        function that adds the two numbers and returns the sum as a linked list.
        EXAMPLE
        Input:(7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
        Output: 2 -> 1 -> 9. That is, 912.
        FOLLOW UP
        Suppose the digits are stored in forward order. Repeat the above problem.
        EXAMPLE
        lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
        Output: 9 -> 1 -> 2. That is, 912.
    */

    private static class PartialSum {
        Node sum=null;
        int carry=0;
    }
    private static Node insertBefore(Node head,int n){
        Node node=new Node(n);
        node.next=head;
        return node;
    }
    private static Node paddList(Node head, int n){
        Node newHead=head;
        while (n>0){
            newHead=insertBefore(newHead, 0);
            n--;
        }
        return newHead;
    }
    private static int len(Node head){
        Node currNode=head;
        int len=0;
        while (currNode != null){
            len++;
            currNode=currNode.next;
        }
        return len;
    }

    public static PartialSum sumListsHelper(Node head1, Node head2){
        PartialSum result=null;
        if (head1 == null && head2 == null){
            result=new PartialSum();
            return result;
        }
        result=sumListsHelper(head1.next, head2.next);

        int val = result.carry + head1.data + head2.data;

        Node fullResult=insertBefore(result.sum, val%10);

        result.sum = fullResult;
        result.carry = val/10;

        return result;
    }

    public static Node sumLists5(Node head1, Node head2){
        Node result=null;
        int n1=len(head1),n2=len(head2);
        if (n1 > n2){
            head2=paddList(head2, n1-n2);
        } else if (n2 > n1){
            head1=paddList(head1, n2-n1);
        }
        PartialSum sum=sumListsHelper(head1, head2);

        if (sum.carry != 0){
            result=insertBefore(sum.sum, sum.carry);
        } else {
            result=sum.sum;
        }

        return result;
    }


    public static Node sumLists4(Node head1, Node head2){
        Node newHead=null;
        int n=0;
        Node currNode1=head1,currNode2=head2;
        while (currNode1!=null || currNode2!=null){
            int n1=(currNode1!=null)?currNode1.data:0;
            int n2=(currNode2!=null)?currNode2.data:0;
            if (newHead == null){
                newHead = new Node((n1+n2+n)%10);
            } else {
                newHead.appendToTail((n1+n2+n)%10);
            }
            n=(n1+n2+n)/10;
            currNode1=(currNode1!=null)?currNode1.next:null;
            currNode2=(currNode2!=null)?currNode2.next:null;
        }
        if (n!=0){
            newHead.appendToTail(n);
        }
        return newHead;
    }




    public static Node sumLists3(Node head1, Node head2){
        Node newHead=null;
        int n=0;
        Node currNode1=head1,currNode2=head2;
        while (currNode1!=null || currNode2!=null){
            int n1=(currNode1!=null)?currNode1.data:0;
            int n2=(currNode2!=null)?currNode2.data:0;
            if (newHead == null){
                newHead = new Node((n1+n2+n)%10);
            } else {
                newHead.appendToTail((n1+n2+n)%10);
            }
            n=(n1+n2+n)/10;
            currNode1=(currNode1!=null)?currNode1.next:null;
            currNode2=(currNode2!=null)?currNode2.next:null;
        }
        if (n!=0){
            newHead.appendToTail(n);
        }
        return newHead;
    }









   public static Node sumLists(Node head1,Node head2){
    StringBuilder numStr1=new StringBuilder(), numStr2=new StringBuilder();
    Node currNode=head1;
    while (currNode != null){
        numStr1.append(currNode.data);
        currNode=currNode.next;
    }
    //System.out.println(numStr1);
    currNode=head2;
    while (currNode != null){
        numStr2.append(currNode.data);
        currNode=currNode.next;
    }
    //System.out.println(numStr2);
    int num1=Integer.parseInt(numStr1.reverse().toString()),num2=Integer.parseInt(numStr2.reverse().toString());
    int sum=num1+num2;
    //System.out.println(sum);
    int usefullSum=Integer.parseInt((new StringBuilder().append(sum)).reverse().toString());
    //System.out.println(usefullSum);
    Node newHead=new Node(usefullSum%10);
    usefullSum/=10;
    while (usefullSum != 0){
        newHead.appendToTail(usefullSum%10);
        usefullSum/=10;
    }
    return newHead;
   }
   public static Node sumLists2(Node head1, Node head2){
    int num1=0,num2=0,n=1;
    Node currNode=head1;
    while (currNode != null){
        num1+=n*currNode.data;
        n*=10;
        currNode=currNode.next;
    }
    currNode=head2;
    n=1;
    while (currNode != null){
        num2+=n*currNode.data;
        n*=10;
        currNode=currNode.next;
    }
    int sum=num1+num2;
    n=10;
    Node newHead=new Node(sum%n);
    sum/=n;
    while (sum !=0){
        newHead.appendToTail(sum%n);
        sum/=n;
    }
    return newHead;
   }
    

    
}