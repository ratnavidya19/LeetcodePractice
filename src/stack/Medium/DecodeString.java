package stack.Medium;

import java.util.Stack;

//Given an encoded string, return its decoded string.
//Youtube - https://www.youtube.com/watch?v=SF2W6VDs7bc&t=2s
public class DecodeString {

    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> wordStack = new Stack<>();
        int number = 0;
        StringBuilder word = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                number = number * 10 + (ch - '0');
            }
            else if(Character.isLetter(ch)){
                word.append(ch);
            }
            else if(ch == '['){
                countStack.add(number);
                wordStack.add(word.toString());
                number = 0;
                word = new StringBuilder();
            }
            else
            {
                int count = countStack.pop();
                StringBuilder duplicateWord = new StringBuilder(wordStack.pop());
                for(int j =0; j<count; j++){
                    duplicateWord.append(word);
                }
                word = duplicateWord;
            }

        }

        return word.toString();
    }
}
