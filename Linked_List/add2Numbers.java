class Solution {
    public ListNode addTwoLists(ListNode l1, ListNode l2, int carry) {
        int sum=carry;
        if(l1==null && l2==null && carry==0)
            return null;
        
        if(l1!=null)
        {
            sum+=l1.val;
            l1=l1.next;
        }
        if(l2!=null)
        {
            sum+=l2.val;
            l2=l2.next;
        }
        // sum = sum % 10;
        ListNode newNode = new ListNode(sum % 10);
        newNode.next = addTwoLists(l1,l2, sum>=10?1:0 );
        return newNode;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        return addTwoLists(l1,l2,0);
    }
}
