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
    public ListNode reverseList(ListNode head) {
    // int x =head.next.val;
    // System.out.println(x);
    // return head;
    ListNode d = null;
    ListNode n = head;

    while (n != null) {
        ListNode next = n.next;
        n.next = d;
        d = n;
        n = next;
    }

    return d;}
}
