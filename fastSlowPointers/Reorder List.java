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
    
    public ListNode findSecondHalf(ListNode head) // always returns the first element of second half if even and if odd it puts middle element in first half and returns the first element of second half 
    {
        ListNode slow=head, fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=slow.next;
        slow.next=null; //Making first half end at null and breaking its connection with secondHalf
        return secondHalf;
    }
    
    public ListNode reverseSecondHalf(ListNode head)
    {
        ListNode temp;
        ListNode prev=head;
        ListNode next=head.next;
        head.next=null;
        
        while(next!=null)
        {
            temp=next.next;
            next.next=prev;
            prev=next;
            next=temp;
        }
        return prev;
        
    }
    public void print(ListNode head)
    {
        while(head!=null)
        {
            System.out.println(head.val);
            head=head.next;
        }
    }
    
    public void reorderList(ListNode head) {
        // System.out.println(findSecondHalf(head).val);
        if(head.next!=null)
        {
           ListNode secondHalf = findSecondHalf(head);
        secondHalf=reverseSecondHalf(secondHalf);
        ListNode firstHalf=head;
        // print(secondHalf);
        ListNode temp1,temp2;
        while(secondHalf!=null && firstHalf!=null)
        {
            temp1=firstHalf.next;
            temp2=secondHalf.next;
            firstHalf.next=secondHalf;
            secondHalf.next=temp1;
            firstHalf=temp1;
            secondHalf=temp2;
        } 
        }
            
        
    }
}
