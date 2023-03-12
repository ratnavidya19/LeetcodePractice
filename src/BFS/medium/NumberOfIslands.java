package BFS.medium;

//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
// return the number of islands.
//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
// You may assume all four edges of the grid are all surrounded by water.
//reference - https://www.youtube.com/watch?v=FGjqL2330qM
public class NumberOfIslands {

    public int noOfIslands(char[][] matrix){


        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 1){
                    checkNeighbors(matrix, i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void checkNeighbors(char[][] matrix, int i, int j){

        if(i<0 || j<0 || i>= matrix.length || j>= matrix[0].length){
            return;
        }
        if(matrix[i][j] == 0){
            return;
        }

        matrix[i][j] = 0;
        checkNeighbors(matrix, i+1, j);
        checkNeighbors(matrix, i-1, j);
        checkNeighbors(matrix, i, j+1);
        checkNeighbors(matrix, i, j-1);

    }


    public static void main(String[] args) {

        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] matrix = {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        int number = numberOfIslands.noOfIslands(matrix);
        System.out.println("No of Islands: " + number);


    }
}
