class MyStack {
    Queue<Integer> numbers  = new LinkedList<Integer>();

    public MyStack() {
          
    }
    
    public void push(int x) {
        numbers.offer(x);
        for(int i = 0 ;i<numbers.size()-1;i++)
        {
            numbers.offer(numbers.peek());
            numbers.remove() ;
        }
    }
    
    public int pop() {
        return numbers.remove() ;
    }
    
    public int top() {
        return numbers.peek();
    }
    
    public boolean empty() {
        return numbers.isEmpty();
    }
}

