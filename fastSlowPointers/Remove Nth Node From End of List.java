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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy;
        ListNode right = head;
        while(n!=0 && right!=null) //right!=null is for case of single node linked list
        {
            right=right.next;
            n--;
        }
        
        while(right!=null)
        {
            left=left.next;
            right=right.next;
        }
        System.out.println(left.val);
        left.next=left.next.next;
        return dummy.next; //dummy.next is for case of single node linked list and works for                              all others
    }
}
