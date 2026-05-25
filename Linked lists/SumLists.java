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
    /*
    The first thing to do is to determine the algorithm :
    - collect the numbers
    - sum
    - divisions & new linked list
    */
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