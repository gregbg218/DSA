//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	   String lcs = LongestSubsequenceString(str1,str2);
	   int noOfDeletions = str1.length()-lcs.length();
	   int noOfInsertions = str2.length()-lcs.length();
	   
	   return noOfDeletions+noOfInsertions;
	}
	
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
}
