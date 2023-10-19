class Solution {
    public int characterReplacement(String s, int k) {
        int windowSize=0;
        int windowStart=0;
        int result=Integer.MIN_VALUE;
        int maxCount=Integer.MIN_VALUE;
        int[] charFreq = new int[26];
        
        for(int windowEnd=0;windowEnd<s.length();windowEnd++)
        {
            charFreq[s.charAt(windowEnd)-'A']++;
            int currCharFreq=charFreq[s.charAt(windowEnd)-'A'];
            windowSize++;
            maxCount=Math.max(currCharFreq,maxCount);

            while(windowSize-maxCount>k)
            {
                charFreq[s.charAt(windowStart)-'A']--;
                windowStart++;
                windowSize--;
            }
            result=Math.max(result,windowSize);
            
        }
            return result;
            
        }
        
    
}
