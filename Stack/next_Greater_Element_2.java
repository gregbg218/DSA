class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<Integer>();
        int[] ans = new int[nums.length];
        
        for(int i=2*(nums.length)-1; i>=0 ; i--)
        {
            // System.out.println("current no is "+nums[i%nums.length]+ " of position "+i%nums.length);
            
            
            while(!st.isEmpty() && st.peek() <= nums[i%nums.length])
                st.pop();
            if(st.isEmpty())
            {
                ans[i%nums.length] = -1;
            }
            else
            {
                ans[i%nums.length] = st.peek();
            }
            st.push(nums[i%nums.length]);
            // System.out.println("\n current stack "+ st.peek());
        }
        return ans;
    }
}
