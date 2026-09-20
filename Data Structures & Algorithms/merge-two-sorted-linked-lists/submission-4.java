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
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<=list2.val){
            ListNode curent=list1;
            ListNode t=list2;

            while(t!=null){
                if(curent.next==null){
                    curent.next=t;
                    break;
                }
                else if(curent.next.val<=t.val){
                    curent=curent.next;
                }
                else{ 
                    ListNode list=curent.next;
                    curent.next=t;
                    t=list;
                
                }
        }
        return list1;
        }else{
            ListNode curent=list2;
            ListNode t=list1;

            while(t!=null){
                if(curent.next==null){
                    curent.next=t;
                    break;
                }
                else if(curent.next.val<=t.val){
                    curent=curent.next;
                }
                else{ 
                    ListNode list=curent.next;
                    curent.next=t;
                    t=list;
                
                }
        } return list2 ;
        }
       
    }
}