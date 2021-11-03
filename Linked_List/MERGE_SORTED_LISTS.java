class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode temp=null;
        
        if(h1==null)
            return h2;
        if(h2 == null)
            return h1;
        
        
        //FOR HEAD OF LIST TO BE RETURNED
        if(h1.val>h2.val)
        {
            temp = h1;
            h1 = h2;
            h2 = temp;
        }
        ListNode res = h1;
        
        while(h1!=null && h2!=null)
        {
            
            while(h1!=null && h1.val<=h2.val)
            {
                temp =h1;
                h1 = h1.next;
            }
            temp.next = h2;
            
            temp = h1;
            h1 = h2;
            h2 = temp;
        }
        return res ;
    }
}
