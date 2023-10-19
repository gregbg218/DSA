class Solution {
    
    public int findSumOfDigitsSquare(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
    
    public int findSlowNext(int n)
    {
        return findSumOfDigitsSquare(n);
        
    }
    
    public int findFastNext(int n)
    {
        n=findSumOfDigitsSquare(n);
        return findSumOfDigitsSquare(n);
    }
    
    
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=findSlowNext(slow);
            fast=findFastNext(fast);
            
        }while(slow!=fast);
        return (slow==1);
        
    }
}
