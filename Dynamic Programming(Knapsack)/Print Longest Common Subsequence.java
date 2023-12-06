import java.util.*;

class Solution {

    public static String LongestSubsequenceString(String text1, String text2)
    {


        int text1Length=text1.length();
        int text2Length=text2.length();
        String[][] dp = new String[text1Length+1][text2Length+1];

        for(int i=0;i<=text2Length;i++)
        {

            dp[0][i]="";

        }

        for(int i=0;i<=text1Length;i++)
        {

            dp[i][0]="";

        }

        for(int i=1;i<=text1Length;i++)
        {
            for(int j=1;j<=text2Length;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]= dp[i-1][j-1]+text1.charAt(i-1);
                else
                {
                    if(dp[i-1][j].length()>dp[i][j-1].length()) // Same as Integer.Max() Step
                        dp[i][j]=dp[i-1][j];
                    else
                        dp[i][j]=dp[i][j-1];

                }
            }
        }

        return dp[text1Length][text2Length];

    }


    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();
        String res=LongestSubsequenceString(X, Y);
        System.out.println(res);
    }
}

//This whole sum is same as longest common subsequence length only it has slight modifications
