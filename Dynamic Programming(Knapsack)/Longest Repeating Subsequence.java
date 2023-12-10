class Solution
{
    public int LongestRepeatingSubsequence(String text1)
    {
        String text2 = text1;
        int text1Length=text1.length();
        int text2Length=text1.length();
        
        
        int[][] dp = new int[text1Length+1][text2Length+1];  
       
        for(int i=0;i<=text2Length;i++)
        {
           
            dp[0][i]=0;
           
        }

        for(int i=0;i<=text1Length;i++)
        {
           
            dp[i][0]=0;
           
        }

        for(int i=1;i<=text1Length;i++)
       {
           for(int j=1;j<=text2Length;j++)
           {
               if(text1.charAt(i-1)==text2.charAt(j-1) && i!=j) // only change is here if the index is same we dont want it otherwise same as lcs                  
                   dp[i][j]= 1+dp[i-1][j-1];   
            else
            {
                dp[i][j]=Math.max
                (
                    dp[i-1][j],
                    dp[i][j-1]
                );
            }
           }
       }

       return dp[text1Length][text2Length];
    }
}


//Input:
//str = "axxzxy"
//Output: 2
//Explanation:
//The given array with indexes looks like
//a x x z x y 
//0 1 2 3 4 5
//
//The longest subsequence is "xx". 
//It appears twice as explained below.
//
//subsequence A
//x x
//
//1 2  <-- index of str 
//
//
//subsequence B
//x x
//
//2 4  <-- index of str 
//
//We are able to use character 'x' 
//(at index 2 in str) in both subsequences
//as it appears on index 1 in subsequence A 
//and index 0 in subsequence B.
