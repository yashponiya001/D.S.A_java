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
    public ListNode deleteMiddle(ListNode head) {
     if(head ==null || head.next ==null){
         return null;
     }   

     ListNode slow = head;
     ListNode fast = head;
     ListNode prevSlow = null;
     // Use the concept of slow and fast pointer where in this case, the fast pointer is moving ahead at twice the speed of the slow pointer

     while (fast !=null && fast.next !=null){
         prevSlow = slow;
         slow = slow.next;
         fast = fast.next.next;
     }
     prevSlow.next = slow.next;
     return head;
    }
}
