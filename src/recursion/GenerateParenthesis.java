package recursion;

import java.util.ArrayList;
import java.util.List;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//Youtube - https://www.youtube.com/watch?v=WW1rYrR3tTI
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        genParan(answer, n, 0, 0, "");
        return answer;
    }

    void genParan(List<String> answer, int n, int open, int close, String curr_str){

        if(curr_str.length() == n*2){
            answer.add(curr_str);
            return;
        }
        if(open < n){
            genParan(answer, n, open+1, close, curr_str+"(");
        }
        if(close < open){
            genParan(answer, n, open, close+1, curr_str+")");
        }
    }
}
