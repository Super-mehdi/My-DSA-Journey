import java.util.Set;
import java.util.HashSet;

public class RemoveDups {
    /*
        Remove Dups : Write code to remove duplicates from an unsorted linked list.
        FOLLOW UP:How would you solve this problem if a temporary buffer is not allowed?
        Hints: #9, #40
    */
    /*
    what's the actual fuck ?
    Okay, chill. How would I do that to a list ?
    -> Use a new space, if I have found the element before, I will skip the current element. I guess this might work for this problem.
    */
    public static void removeDups(Node head){
        Set<Integer> elements=new HashSet<>();
        Node currentNode=head;
        elements.add(currentNode.data);
        while (currentNode.next != null){
            if (! elements.contains(currentNode.next.data)){
                elements.add(currentNode.next.data);
                currentNode=currentNode.next;
            } 
            else {
                currentNode.next=currentNode.next.next;
            }
        }
    }
    public static void removeDupsNoBuffer(Node head){
        Node currentNode=head;
        Node runnerNode=head;
        while (currentNode != null){
            int d=currentNode.data;
            runnerNode=currentNode;
            while (runnerNode.next != null){
                if (runnerNode.next.data == d){
                    runnerNode.next=runnerNode.next.next;
                }else{
                    runnerNode=runnerNode.next;
                }
            }
            currentNode=currentNode.next;
        }
    }
}