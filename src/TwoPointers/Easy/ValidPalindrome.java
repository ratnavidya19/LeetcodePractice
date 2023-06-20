package TwoPointers.Easy;

import DFS.Medium.ConstructBinaryTreefromPreorderandInorderTraversal;

//Time complexity - O(n)
public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            char ch1 = s.charAt(start);
            char ch2 = s.charAt(end);

            if(!Character.isLetterOrDigit(ch1)){
                start++;
            }
            else if(!Character.isLetterOrDigit(ch2)){
                end--;
            }
            else{
                if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2)){
                    return false;

                }
                start++;
                end--;
            }
        }

        return true;
    }
}
