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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        result = traverse(l1, l2, result);
        return result;
    }

    private int carry = 0;
    private int sum = 0;

    private ListNode traverse(ListNode l1, ListNode l2, ListNode result) {
        if(l1 == null && l2 == null) {
            if(carry == 1) {
                result = new ListNode();
                result.val = 1;
            }
            return result;
        }

        if(l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            carry = 0;
            result = new ListNode();
            if(sum > 9) {
                result.val = sum % 10;
                carry = 1;
            } else {
                result.val = sum;
            }

            result.next = traverse(l1.next, l2.next, result.next);
        }

        if(l1 != null && l2 == null) {
            sum = l1.val + carry;
            carry = 0;
            result = new ListNode();
            if(sum > 9) {
                result.val = sum % 10;
                carry = 1;
            } else {
                result.val = sum;
            }

            result.next = traverse(l1.next, l2, result.next);
        }

        if(l1 == null && l2 != null) {
            sum = l2.val + carry;
            carry = 0;
            result = new ListNode();
            if(sum > 9) {
                result.val = sum % 10;
                carry = 1;
            } else {
                result.val = sum;
            }

            result.next = traverse(l1, l2.next, result.next);
        }

        return result;
    }
}