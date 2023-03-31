package SlidingWindow.Medium;

import java.util.HashMap;
//Given a string s, find the length of the longest substring without repeating characters.
//https://www.youtube.com/watch?v=qtVh-XEpsJo  or https://www.youtube.com/watch?v=RqxIXM6eyiY
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        while (right < s.length()) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;

    }

    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharacters longSubString = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        int maxlen = longSubString.lengthOfLongestSubstring(s);
        System.out.println(maxlen);


    }
}
