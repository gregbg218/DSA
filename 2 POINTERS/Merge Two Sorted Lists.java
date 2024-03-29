/**
 https://www.youtube.com/watch?v=XIdigk956u0
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode dummy = head;
        
        while(list1!=null && list2!=null)
        {
        if(list1.val>list2.val)
        {
            dummy.next=list2;
            list2=list2.next;
        }
        else 
        {
            dummy.next=list1;
            list1=list1.next;
        }
            dummy=dummy.next;
            
        }
        if(list1!=null)
            dummy.next=list1;
        else
            dummy.next=list2;
        
        return head.next;
    }
}
