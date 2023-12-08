

class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuffer bf = new StringBuffer("");
        int i=n;
        int j=m;
        while(i>0 && j>0)
        {
            if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                bf.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                bf.append(str1.charAt(i-1));   // This is an extra line from print longest common subsequence 1
                i--;
            }
            else
            {
                bf.append(str2.charAt(j-1));  // This is an extra line from print longest common subsequence 1
                j--;
            }
        }
        System.out.println(bf.toString());

        while(i>0)
        {
            bf.append(str1.charAt(i-1));
            i--;
        }
        while(j>0)
        {
            bf.append(str2.charAt(j-1));
            j--;
        }
        return bf.reverse().toString();
        
    }
}


// The "while(i>0 && j>0)" while loop is same as print longest common subsequence 1
// except for the 2 lines

//Note in subsequence though there can be gaps between the characters, 
// the order of them shouldnt change
// example "bc" can become bdc or gbac but not cab or cb
// so to preserve the order we must use the above peculiar way shown in the 
//2 extra lines
// see in the video from 13:00 to 14:15

// Also from the last 2 while loops either while(i>0) or while(j>0) will run
//not both as the previous loop (while(i>0 && j>0)) stops when either i or j 
//becomes 0
