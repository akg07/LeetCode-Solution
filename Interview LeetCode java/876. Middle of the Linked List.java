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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        ListNode result = head;
        
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        if(count == 1) return head;
        
        int n = count/2 + 1;
        while (--n > 0){
            result = result.next;
        }
        return result;
    }
}