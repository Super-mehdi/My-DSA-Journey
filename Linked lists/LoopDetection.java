import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;



public class LoopDetection {

    /*
    Input : A linked list with a loop such as 1->2->3->4->5->6->3 (the same 3 as earlier)
    Output : Pointer to node 3
    */

    public static Node detectLoop1(Node head){
        Set<Node> visitedNodes = new HashSet<>();
        Node currentNode = head;
        while (currentNode != null){
            if (visitedNodes.contains(currentNode)) return currentNode;
            visitedNodes.add(currentNode);
            currentNode = currentNode.next;
        }
        return null;
    }

    public static Node detectLoop2(Node head){
        Node slow = head, fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }

    

}