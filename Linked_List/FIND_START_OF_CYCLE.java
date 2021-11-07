public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = null;
        
        if(fast==null || fast.next==null)
            return null;
        
        System.out.println("outside");
        while(fast.next!=null  && fast.next.next!=null)
        {
            System.out.println("inside");
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                entry = head;
                while(entry!=slow)
                {
                slow = slow.next;
                entry = entry.next;
                }
                break;
               
            }
        }
        
        return entry;
    }
}
