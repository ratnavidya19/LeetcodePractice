package TwoPointers.Easy;

import java.util.Stack;

//Given two strings s and t, return true if they are equal when both are typed into empty text editors.
// '#' means a backspace character.
//Note that after backspacing an empty text, the text will continue empty.
//reference - https://www.youtube.com/watch?v=ddyikohCqyo
public class BackspaceStringCompare {
    //bruteForce
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = backSpaceOperationWithStack(s);
        Stack<Character> s2 = backSpaceOperationWithStack(t);

        return (s1.equals(s2));


    }

    public Stack<Character> backSpaceOperationWithStack(String str){

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != '#'){
                stack.push(str.charAt(i));
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }

        return stack;
    }

}
