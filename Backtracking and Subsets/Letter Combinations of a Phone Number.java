//https://github.com/gregbg218/DSA/blob/main/Backtracking%20and%20Subsets/Letter%20Combinations%20of%20a%20Phone%20Number.md

class Solution {
    List<String> result = new ArrayList<>();
  
    HashMap<Character, String> numberToCharacters = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return result;

        initializeNumberToCharacters();

        backTrackAndFind(0, "", digits);

        return result;
    }

    public void initializeNumberToCharacters() {
        numberToCharacters.put('2', "abc");
        numberToCharacters.put('3', "def");
        numberToCharacters.put('4', "ghi");
        numberToCharacters.put('5', "jkl");
        numberToCharacters.put('6', "mno");
        numberToCharacters.put('7', "pqrs");
        numberToCharacters.put('8', "tuv");
        numberToCharacters.put('9', "wxyz");
    }

    public void backTrackAndFind(int digitPosition, String currStr, String inputDigits) {
        if (currStr.length() == inputDigits.length()) {
            result.add(currStr);
            return;
        }

        char digit = inputDigits.charAt(digitPosition);
        String charactersAtDigit = numberToCharacters.get(digit);

        for (char c : charactersAtDigit.toCharArray()) {
            backTrackAndFind(digitPosition + 1, currStr + c, inputDigits);// String datatype is immutable thats why we are not doing currStr=currStr + c
                                                                          // as that makes us lose the old value of string which we need after backtracking
        }
    }
}
