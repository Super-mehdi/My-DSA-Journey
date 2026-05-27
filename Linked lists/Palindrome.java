public class Palindrome {
    /*
        Palindrome: Implement a function to check if a linked list is a palindrome.
    */

    //Option 1 : reverse + compare.
    //Option 2 : determine length + get middle node + only reverse the first half.

    private static Node insertBefore(Node head,int n){
        Node node=new Node(n);
        if (head == null ) return node;
        node.next=head;
        return node;
    }

    public static Node reverseAndCloneList(Node head){
        Node newHead=null;
        Node currNode=head;
        while (currNode != null){
            newHead = insertBefore(newHead, currNode.data);
            currNode = currNode.next;
        }
        return newHead;

    }

    public static boolean isPalindrome(Node head){
        Node newHead = reverseAndCloneList(head);
        Node currNode1=head,currNode2=newHead;
        while (currNode1 != null && currNode2 != null){
            if (currNode1.data != currNode2.data ) return false;
            currNode1=currNode1.next;
            currNode2=currNode2.next;
        }
        return true;
    }
}
