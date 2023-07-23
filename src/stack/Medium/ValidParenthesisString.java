package stack.Medium;

import java.util.Stack;


//Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
//Youtube - https://www.youtube.com/watch?v=KuE_Cn3xhxI
//Time complexity - O(n)
public class ValidParenthesisString {

    public boolean checkValidString(String s) {

        Stack<Integer> openbracket = new Stack<>();
        Stack<Integer> stars = new Stack<>();

        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                openbracket.push(i);
            }
            else if(c == '*'){
                stars.push(i);
            }
            else if(!openbracket.isEmpty()){
                openbracket.pop();
            }
            else if(!stars.isEmpty()){
                stars.pop();
            }
            else
            {
                return false;
            }
        }

        while(!openbracket.isEmpty() && !stars.isEmpty() && (openbracket.peek() < stars.peek())){

            openbracket.pop();
            stars.pop();
        }

        return openbracket.isEmpty();


    }
}
