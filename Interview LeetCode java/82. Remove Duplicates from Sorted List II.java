/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy, curr = head;
        Boolean isDistinct = true;
        
        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val) {
                curr.next = curr.next.next;
                isDistinct = false;
            }
            
            if(!isDistinct)
                prev.next = curr.next;
            else
                prev = curr;
            curr = curr.next;
            isDistinct = true;
        }
        return dummy.next;
    }
}