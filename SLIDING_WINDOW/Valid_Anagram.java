

class Solution {
    public boolean isAnagram(String s, String p) {
        int left=0;
        int windowSize=0; 
        int limitSize=p.length();
        int pcount[]=new int[26];
        int scount[]=new int[26];

        if(p.length()!=s.length())
            return false;
        
        for(int i = 0 ;i<p.length();i++)
        {
            pcount[p.charAt(i)-'a']++;
        }
        
        for(int right=0;right<s.length();right++)
        {
                windowSize++;
                scount[s.charAt(right)-'a']++;

                
                if(windowSize>limitSize)
                {
                    scount[s.charAt(left)-'a']--;
                    windowSize--;
                    left++;
                }
            
                if(compare(pcount,scount))
                {
                    return true;
                }


        }
        
        return false;
    }
    
    public boolean compare(int pcount[],int scount[])
    {
        for(int i = 0 ;i<26;i++)
        {
            if(pcount[i]!=scount[i])
                return false;
        }
        return true;
    }
}
