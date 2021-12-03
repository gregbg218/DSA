class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        
        
        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i)) == '(' || (s.charAt(i)) == '[' || (s.charAt(i)) == '{')
            {
                st.push(s.charAt(i));
            }
            
            else if((s.charAt(i)) == ')' && !st.isEmpty() && (st.peek()) == '(')
            {
                // System.out.println("in )");
                st.pop();
            }
                
            else if((s.charAt(i)) == ']' && !st.isEmpty() && (st.peek()) == '[')
            {
                // System.out.println("in ]");
                st.pop();
            }
            
            else if((s.charAt(i)) == '}' && !st.isEmpty() && (st.peek()) == '{')
            {
                // System.out.println("in }");
                st.pop();
            }
            else
            {
                // System.out.println("in else");
                return false;
            }
                
        }
                                                               
        if(st.isEmpty())
            return true;                                                       
        return false;
    }
}
