class Solution {
    List<String> result=new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backTrackAndGenerate(1,0,"(",n);
        return result;
        
    }

    public void backTrackAndGenerate(int openCount,int closeCount,String currStr,int pairLimit)
    {
        if(openCount==closeCount && closeCount==pairLimit)
        {
            result.add(currStr);
            return;
        }

        if(openCount<pairLimit) // The above if condition is "AND" type so it couldnt check this condition which prevents code from going to infinity
        {
            backTrackAndGenerate(openCount+1,closeCount,currStr+"(",pairLimit);
        }

        if(openCount>closeCount) // The only condition to ensure that a close bracket doesnt remain unopened example: )()()
        {
            backTrackAndGenerate(openCount,closeCount+1,currStr+")",pairLimit);
        }

        
        
    }

}
