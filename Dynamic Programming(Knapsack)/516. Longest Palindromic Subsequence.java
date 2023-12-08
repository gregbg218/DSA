class Solution {
    public int longestPalindromeSubseq(String text1) {
        StringBuilder reverseStringBuilder = new StringBuilder(text1).          reverse();
        String text2 = reverseStringBuilder.toString();

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
