package backtracking.medium;

//Given an m x n grid of characters board and a string word, return true if word exists in the grid.
//The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or
// vertically neighboring. The same letter cell may not be used more than once.
//Youtube - https://www.youtube.com/watch?v=m9TrOL1ETxI
public class WordSearch {

    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;

        boolean visited[][] = new boolean[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(word.charAt(0) == board[i][j] && searchWord(i, j, board, word, 0, visited)){
                    return true;
                }
            }
        }

        return false;

    }

    public boolean searchWord(int i, int j, char[][] board, String word, int index, boolean visited[][]){

        if(index == word.length()){
            return true;
        }

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j] || (word.charAt(index) != board[i][j])){
            return false;
        }

        visited[i][j] = true;
        if(searchWord(i+1, j, board, word, index+1, visited) ||
                searchWord(i-1, j, board, word, index+1, visited) ||
                searchWord(i, j+1, board, word, index+1, visited) ||
                searchWord(i, j-1, board, word, index+1, visited)){
            return true;
        }

        visited[i][j] = false;
        return false;
    }

}
