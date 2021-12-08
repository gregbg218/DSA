public class Solution {
    public int largestRectangleArea(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<Integer>();
        int[] left = new int[A.size()];
        int[] right = new int[A.size()];
        int i , max = -1;
        
        if(A.size()<2)
        {
            return A.get(0);
        }
        
        for(i = 0 ; i<A.size(); i++ )
        {
            while( !st.isEmpty() && A.get(st.peek()) >= A.get(i) )
                st.pop();
            if(st.isEmpty())
            {
                left[i] = 0;
                
            }
            else
            {
                left[i] = st.peek()+1;
            }
            
            st.push(i);
        }
        
        st = new Stack<Integer>();
        for( i = A.size()-1 ; i>=0; i-- )
        {
            while( !st.isEmpty() && A.get(st.peek()) >= A.get(i) )
                st.pop();
            if(st.isEmpty())
            {
                right[i] = A.size()-1;
                
            }
            else
            {
                right[i] = st.peek()-1;
            }
            
            st.push(i);
        }
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        for(i = 0 ; i<A.size(); i++ )
        {
            int sum = (right[i] -left[i]+1) * A.get(i);
            // max = sum>max ? sum : max;
            if(sum>max)
            {
                // System.out.println("Choosing "+ i+" "+(right[i] -left[i]+1)+ " "+A.get(i));
                max = sum;
            }
                
        }
        
        return max;
    }
}
