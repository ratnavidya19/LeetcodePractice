package hashing.Easy;

import java.util.HashMap;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.Given a roman numeral,
// convert it to an integer.
//Time compexity = O(n)
public class RomanToInteger {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        for(int i =0; i<s.length(); i++){
            if(i < s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }
            else{
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }
}
