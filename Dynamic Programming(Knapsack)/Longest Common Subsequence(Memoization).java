class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int text1Length=text1.length();
        int text2Length=text2.length();
        int[][] memoTable = new int[text1Length+1][text2Length+1]; 
       
       for(int i=0;i<=text1Length;i++)
       {
           for(int j=0;j<=text2Length;j++)
           {
               memoTable[i][j]=-1;
           }
       }
       int res=longestCommonSubsequenceMemo(text1,text2,memoTable);
       return res;


        
        
    }

    public int longestCommonSubsequenceMemo(String text1, String text2,int[][] memoTable)
    {

        int text1Length=text1.length();
        int text2Length=text2.length();

        if(memoTable[text1Length][text2Length]!=-1)
            return memoTable[text1Length][text2Length];

        if(text1Length==0 || text2Length==0)
            return memoTable[text1Length][text2Length]=0;
        
        else
        {
            if(text1.charAt(text1Length-1)==text2.charAt(text2Length-1))
                return memoTable[text1Length][text2Length]= 1+
                (
                    longestCommonSubsequenceMemo
                    (
                        text1.substring(0, text1Length-1),
                        text2.substring(0, text2Length-1),
                        memoTable
                    )
                );
            else
            {
                return memoTable[text1Length][text2Length]= 
                Math.max
                (
                    longestCommonSubsequenceMemo
                    (
                        text1.substring(0, text1Length),
                        text2.substring(0, text2Length-1),
                        memoTable
                    ),
                    longestCommonSubsequenceMemo
                    (
                        text1.substring(0, text1Length-1),
                        text2.substring(0, text2Length),
                        memoTable
                    )
                );
            }
        }

    }
}


// Note this is subsequence and not substring
// In subsequence the common character need not be one after the other(it shouldnt be
// continuous) whereas
// in substring the common strings should be continuous

