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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = traverse(list1, list2, null);

        return result;
    }

    private ListNode traverse(ListNode l1, ListNode l2, ListNode result) {
        if(l1 == null && l2 == null) {
            return result;
        }

        result = new ListNode();
        if(l1 != null && l2 !=null) {
            if(l1.val <= l2.val) {
                result.val = l1.val;
                result.next = traverse(l1.next, l2, result.next);                
            } else {
                result.val = l2.val;
                result.next = traverse(l1, l2.next, result.next);                
            }
        }

        if(l1 != null && l2 == null) {
            result.val = l1.val;
            result.next = traverse(l1.next, l2, result.next);
        }
        
        if(l1 == null && l2 != null) {
            result.val = l2.val;
            result.next = traverse(l1, l2.next, result.next);
        }

        return result;
    }
}