package arrays.Medium;

//Given a palindromic string of lowercase English letters palindrome, replace exactly one character with any lowercase English
// letter so that the resulting string is not a palindrome and that it is the lexicographically smallest one possible.
//Youtube - https://www.youtube.com/watch?v=0DSALG_D8-I
public class BreakAPalindrome {

    public String breakPalindrome(String palindrome) {

        char[] ch = palindrome.toCharArray();
        if(ch.length < 2){
            return "";
        }

        for(int i = 0; i<ch.length/2; i++){
            if(ch[i] != 'a'){
                ch[i] = 'a';
                return String.valueOf(ch);

            }
        }

        ch[ch.length-1] = 'b';
        return String.valueOf(ch);

    }
}
