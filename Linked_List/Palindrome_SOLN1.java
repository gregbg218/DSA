class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null )
            {
                return true;
            }
        
        ListNode mid = middleFinder(head);
        ListNode newHead = reverse(mid);
        

        while(newHead!=null)
        {
        
            if(head.val != newHead.val)
            {
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        ListNode newHead = reverse(head.next);
        ListNode temp = head.next;
        temp.next = head;
        head.next = null;
        return newHead;
    }
    
    public ListNode middleFinder(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
