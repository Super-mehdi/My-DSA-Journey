import java.util.Deque;
import java.util.ArrayDeque;

public class Reverse {
    public static Node reverseList(Node head){
        if (head != null && head.next !=null){
            Node currNode=head;
            Deque<Node> stack=new ArrayDeque<>();
            while (currNode != null){
                stack.push(currNode);
                currNode=currNode.next;
            }
            currNode = stack.pop();
            head =currNode;
            while (!stack.isEmpty()){
                currNode.next = stack.pop();
                currNode = currNode.next;
            }
            currNode.next = null;
        }
        return head;
    }
}
