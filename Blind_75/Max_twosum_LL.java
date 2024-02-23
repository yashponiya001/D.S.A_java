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
    public int pairSum(ListNode head) {
        int n=0;
        ListNode current = head;
        while(current!=null) {
            n++;
            current = current.next;
        }

        int[] array = new int[n];
        int i=0;
        current = head;
        while(current!=null) {
            array[i] = current.val;
            i++;
            current = current.next;
        }

        int k=0;
        int j=array.length-1;
        int maxSum = 0;
        while(j>k) {
            maxSum = Math.max(maxSum, array[k]+array[j]);
            k++;
            j--;
        }

        return maxSum;
    }
}
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
/*class Solution {
    public int pairSum(ListNode head) {
        ListNode current = head;
        Stack<Integer> stack = new Stack<>();

        while (current != null){
            stack.push(current.val);
            current = current.next;
        }
        current = head;
        int size = stack.size();
        int count =1;
        int maxSum = 0;
        while ( count<= size/2){
        maxSum = Math.max(maxSum, current.val + stack.peek());
        current = current.next;
        stack.pop();
        count++;
    }
    return maxSum;
}
}*/
