class MyStack {
    Queue<Integer> q1  = new LinkedList<Integer>();
    Queue<Integer> q2  = new LinkedList<Integer>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty())
        {
            q2.add(q1.remove()) ;
        }
        Queue<Integer> temp  = q1;
        q1 = q2 ;
        q2 = temp;
    }
    
    public int pop() {
        
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
