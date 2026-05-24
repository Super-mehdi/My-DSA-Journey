public class DeleteMiddleNode {
    /*
    Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
    the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
    that node.
    my input : a node of a linked list such A -> B -> C -> D -> E, it can be anything from B to D. Let's suppose it's B.
    the output : A -> C -> D -> E, basically no output.
    the idea is A.next should become = B.next, but I have only access to this side of the list : B -> C -> D -> E
    I think I see the other way, if I go through from the last and affect each one to the next, B will be deleted.
    */
   public static void deleteMiddleNode(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
   }
   
}
