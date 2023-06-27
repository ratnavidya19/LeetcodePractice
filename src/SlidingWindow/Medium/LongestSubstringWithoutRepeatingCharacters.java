package SlidingWindow.Medium;

import java.util.HashMap;
import java.util.HashSet;

//Given a string s, find the length of the longest substring without repeating characters.
//https://www.youtube.com/watch?v=qtVh-XEpsJo  or https://www.youtube.com/watch?v=RqxIXM6eyiY
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int start =0, end=0;
        int maxLength = 0;
        while(start < s.length()){
            if(!set.contains(s.charAt(start))){
                set.add(s.charAt(start));
                if((start-end+1) > maxLength){
                    maxLength = start-end+1;
                }
                start++;
            }
            else
            {
                set.remove(s.charAt(end));
                end++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharacters longSubString = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        int maxlen = longSubString.lengthOfLongestSubstring(s);
        System.out.println(maxlen);


    }
}
