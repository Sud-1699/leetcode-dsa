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
        if(head == null)
            return null;

        ListNode result = new ListNode();
        result.val = head.val;
        result.next = iterate(head.next, result.next, head);

        return result;
    }

    private ListNode iterate(ListNode head, ListNode result, ListNode previous) {
        if(head == null)
            return result;

        // if(head != null && head.next != null) {
            if(head.val != previous.val) {
                result = new ListNode();
                result.val = head.val;
                result.next = iterate(head.next, result.next, head);
            }
            else 
                result = iterate(head.next, result, previous);
        // }

        return result;
    }
}