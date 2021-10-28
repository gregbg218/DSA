class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        ListNode fast = head;
        for(int i=0;i<n;i++)
        {
            if(fast==null)
                break;
            fast = fast.next;
        }
        
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next= slow.next.next;
        // System.out.println(slow.next);
        return dummy.next;
    }
}
