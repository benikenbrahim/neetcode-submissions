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
    ListNode p = null;
    ListNode element = head;
    while(element!=null){
        ListNode nex=element.next;
        element.next=p;
        p=element;
        element=nex;

    }
    return p;
    }
}
