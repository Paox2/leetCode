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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;
        
        
        ListNode result = new ListNode();
        ListNode point = result;
        
        while (l1 != null && l2 != null) {
            if(l1.val <= l2.val){
                point.next = l1;
                l1 = l1.next;
            }else{
                point.next = l2;
                l2 = l2.next;
            }  
            point = point.next;
        }
        
        if (l1 != null)
            point.next = l1;
        
        if (l2 != null)
            point.next = l2;
        
        return result.next;
    }
}