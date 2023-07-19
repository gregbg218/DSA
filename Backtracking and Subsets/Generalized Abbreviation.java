import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList < String > findAbbr(String str) {
		ArrayList<String> result = new ArrayList<>();
        backtrack(result, str, "", 0, 0);
        return result;
	}

	private static void backtrack(List<String> result, String word,
	 String current, int position, int count)
	{
        if (position == word.length()) 
		{
            if (count > 0) {
                current += count;
            }
            result.add(current);
        } 
		else 
		{
            // Abbreviate the current character
            backtrack(result, word, current, position + 1, count + 1);
            
            // Keep the current character
            if (count > 0) {
                current += count;
            }
            current += word.charAt(position);
            backtrack(result, word, current, position + 1, 0);
        }
    }
}
