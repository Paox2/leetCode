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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null) {
            if(fast.next!=null) {
                fast=fast.next.next;
                slow=slow.next;
            } else{
                break;
            }
        }
           
        ListNode prev = null, next = null, current = slow;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        while(prev != null){
            if(prev.val != head.val)
                return false;
            prev = prev.next;
            head = head.next;
        }
        
        return true;
    }
}