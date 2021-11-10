class MinStack {
    Stack<Integer> s;
    Stack<Integer> min;
    
    public MinStack() {
        s =new Stack<Integer>();
        min =new Stack<Integer>();
    }
    
    public void push(int val) {
               
        if(s.empty() || min.peek()>=val)
            min.push(val);
        s.push(val);
    }
    
    public void pop() {
        
        if((s.peek()).equals(min.peek()))
            min.pop();
        s.pop();
    }
    
    public int top() {
            return s.peek();
        
    }
    
    public int getMin() {
            return min.peek();
        
    }
}
