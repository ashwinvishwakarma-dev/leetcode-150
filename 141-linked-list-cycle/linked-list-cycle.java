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
    public boolean hasCycle(ListNode head) {
       ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            // Move slow by 1
            slow = slow.next;

            // Move fast by 2
            fast = fast.next.next;

            // They meet if there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        return false; 
    }
}