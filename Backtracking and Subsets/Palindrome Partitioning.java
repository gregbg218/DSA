class Solution {
    public List<List<String>> partition(String s) {
        List<String> tempStr= new ArrayList<String>();
        List<List<String>> res= new ArrayList<>();
        backTrackPalindrome(0,tempStr,res,s);
        return res;
    }

    public void backTrackPalindrome(int startPos,List<String> tempStr,List<List<String>> res,String givenString)
    {
        if(startPos==givenString.length())
            res.add(new ArrayList<>(tempStr));
        else
        {
            for(int i=startPos;i<givenString.length();i++)
            {
                System.out.println("i is "+i);
                printString(tempStr);
                System.out.println("Pal is from ("+startPos+","+i+")");
                
                if(checkPalindrome(startPos,i,givenString))
                {
                    System.out.print("Adding ("+startPos+","+(i+1)+") ");
                    System.out.println(givenString.substring(startPos,i+1));
                    System.out.println("going inside recursion");
                    System.out.println();
                    System.out.println();
                    
                    tempStr.add(givenString.substring(startPos,i+1));
                    
                    backTrackPalindrome(i+1,tempStr,res,givenString);
                    
                    System.out.println("Removing "+tempStr.get(tempStr.size()-1)+" and i is "+i);
                    System.out.println();
                    System.out.println();
                    
                    tempStr.remove(tempStr.size()-1);
                    
                }
                else
                {
                    System.out.println("Not Pal");
                    System.out.println();
                    System.out.println();
                }
            }
        }
    }

    public boolean checkPalindrome(int low, int high,String givenString)
    {
        while(low<high)
        {
            if(givenString.charAt(low++)!=givenString.charAt(high--))  // first comparison is done and then in the next iteration there is increment 
                                                                       // and decrement
                return false;
        }
        return true;
    }
  
    public void printString(List<String> tempStr)
    {

        StringBuilder result = new StringBuilder();
        for (String element : tempStr) {
        if (result.length() > 0) {
            result.append(","); // Add a comma and space except for the first element
        }
        result.append(element);
        }

        // Print the concatenated string
        System.out.println(result.toString());

    }
}


// Notice checkPalindrome is from (3,3) and Adding is from (3,4). Both are same but becos the subString method requires 1 more letter


// What is basically happening is that at each iteration u are adding one letter at a time by checking if the letter at i+1 th index is a
// palindrome or not. So u are adding new palindrome substrings to already stored palindrome substrings/

// Also "i" in the for loop starts from "startPos" and not from 0 as u want the latest susbtring position
