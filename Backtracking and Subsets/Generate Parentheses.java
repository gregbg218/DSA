class Solution {
    List<String> result=new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backTrackAndGenerate(1,0,"(",n);
        return result;
        
    }

    public void backTrackAndGenerate(int openCount,int closeCount,String currStr,int pairLimit)
    {
        if(openCount==pairLimit && closeCount==pairLimit)
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

// Instead of a for loop here we are manually adding so there are 2 recursion statements
// backTrackAndGenerate(openCount+1,closeCount,currStr+"(",pairLimit);
// backTrackAndGenerate(openCount,closeCount+1,currStr+")",pairLimit);

// Also as it is a string based problem we are not removing anything from the list becos it is removed automatically 
// as its only normal string adding like currStr+"(" so no need to remove anything


// Also there will never be imbalances like this "())" becos always open bracket will be added first
