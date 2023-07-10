package backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number
// could represent. Return the answer in any order.
//Solution -https://leetcode.com/problems/letter-combinations-of-a-phone-number/solutions/3628758/java-using-recursion/
public class LetterCombOfAPhoneNo {

    String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        if(digits.length() == 0)
        {
            return list;
        }

        letterComb(list, digits, "");
        return list;

    }

    public void letterComb(ArrayList<String> list, String digits, String ans){

        if(digits.length() == 0){
            list.add(ans);
            return;
        }

        String key = map[digits.charAt(0)-48];
        for(int i = 0; i < key.length(); i++){
            letterComb(list, digits.substring(1), ans+key.charAt(i));
        }

    }
}
