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
    public ListNode findSecondHalf(ListNode head)
    {
        ListNode slow=head, fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=slow.next;
        slow.next=null;
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
    
    public boolean isPalindrome(ListNode head) {
        if(head.next!=null)
        {
        ListNode firstHalf = head;
        ListNode secondHalf = findSecondHalf(head);
        secondHalf=reverseSecondHalf(secondHalf);
        while (secondHalf!=null)
        {
            if(firstHalf.val!=secondHalf.val)
                return false;
            
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
            
        }
        return true;
        }
        return true;
        
    }
}
