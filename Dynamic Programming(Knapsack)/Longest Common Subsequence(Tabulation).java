class Solution {
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int text1Length=text1.length();
        int text2Length=text2.length();
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
               if(text1.charAt(i-1)==text2.charAt(j-1))
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

// Note this is subsequence and not substring
// In subsequence the common character need not be one after the other(it should not be
// continuous) whereas
// in substring the common strings should be continuous


// Here we are initialising not only first row but also first column unlike 
// the knapsack sum as this time both rows and columns are strings
// unlike last time in subset sum where rows were n and columns were sum
// Also we have started j from 1 this time

// Also note in subsequence though there can be gaps between the characters, 
// the order of them shouldnt change
// example if bc can become bdc or gbac but not cab or cb


// in the grid (x,y) means when we have first x letters of string 1 and first y letters of string 2 what is the lcs

// first row in the matrix represents what is the common letter when string 1 length is0 and string 2 length goes from 0 to string2Length
// vice versa for 1st column

