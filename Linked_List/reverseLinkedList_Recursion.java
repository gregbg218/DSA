class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null )
            return head;
        
        ListNode newHead = reverseList(head.next);
        ListNode prev = head.next;
        prev.next = head;
        head.next = null;
        return newHead;
    }
}
