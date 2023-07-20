package dynamicProgramming.medium;

//Given a string s, return the longest palindromic substring in s.
//Youtube - https://www.youtube.com/watch?v=fxwvVnBMN6I
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        int[][] dp = new int[s.length()][s.length()];
        int n = s.length();
        String ans = "";
        int maxLength = 0;

        for(int diff = 0; diff < n; diff++){
            for(int i = 0, j = i+diff; j<n; i++,j++){
                if(i == j){
                    dp[i][j] = 1;
                }
                else if(diff == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = 2;
                    }else{
                        dp[i][j] = 0;
                    }
                }else
                {
                    if(s.charAt(i) == s.charAt(j) && (dp[i+1][j-1] > 0)){
                        dp[i][j] = dp[i+1][j-1] + 2;
                    }
                }

                if(dp[i][j] != 0){
                    if(j-i+1 > maxLength){
                        maxLength = j-i+1;
                        ans = s.substring(i, maxLength);
                    }


                }
            }
        }

        return ans;

    }

    /*

     public String longestPalindrome(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];


        String ans="";
        int maxLength=0;
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<s.length();i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                    }
                    else{
                        dp[i][j]=false;;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j]=true;
                    }
                    else{
                        dp[i][j]=false;
                    }
                }

                if(dp[i][j]){
                    if(j-i+1>maxLength){
                        maxLength=j-i+1;
                        ans=s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }

     */
}
