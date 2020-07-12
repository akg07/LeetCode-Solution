/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null;
        
        Node dummy = head;
        while(dummy != null) {
            if(dummy.child != null){
                Node nextNode = dummy.next;
                Node childNode = flatten(dummy.child);
                
                dummy.child = null;
                dummy.next = childNode;
                childNode.prev = dummy;
                
                while(dummy.next != null) dummy = dummy.next;
                dummy.next = nextNode;
                
                if(nextNode != null) nextNode.prev = dummy;
            }
            dummy = dummy.next;
        }
        return head;
    }
}