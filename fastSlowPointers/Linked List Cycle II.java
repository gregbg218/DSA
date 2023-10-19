
/**
 * 
 
 
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow;
        ListNode fast;
        slow = fast = head;
        
        while(fast!=null && fast.next!=null  )
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(fast==slow)
            { 
                slow = head;
                while(fast!=slow)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
            
        }
        return null;
        
    }
}
