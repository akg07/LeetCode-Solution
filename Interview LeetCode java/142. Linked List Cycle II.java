/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // ListNode temp = head;
//         brute force methode
//         if(head == null) return head;
        
//         HashSet<ListNode> s = new HashSet<ListNode>();
        
//         while (temp != null) {
//             if(s.contains(temp))
//                 return temp;
            
//             s.add(temp);
//             temp = temp.next;
//         }
        // return temp;
        if(head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        fast = head;
        
        while(slow != null && fast != null && slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}