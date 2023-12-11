class Solution {
    public int minInsertions(String s) 
    {
        return s.length()-longestPalindromeSubseq(s);
    }


    public int longestPalindromeSubseq(String text1) {
        StringBuilder reverseStringBuilder = new StringBuilder(text1).reverse();
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







// Here we are using 2 past questions Minimum number of Deletions to make palindrome and Longest Palindromic SubSequence
// Basically if string = abffea then to make palindrome using deletions we get palindromic subsequence as affa and we need to make 2 deletions
// b and e

// Now the thing is this is same as saying if we insert an "e" after "b" and a "b" after the 2nd last "e" then it becomes a palindrome
// So basically number of deletions= no of insertions






