package BFS.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean. The Pacific Ocean touches
// the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.
//The island is partitioned into a grid of square cells. You are given an m x n integer matrix heights where
// heights[r][c] represents the height above sea level of the cell at coordinate (r, c).
//reference - https://www.youtube.com/watch?v=64496xYlLJQ
public class PacificAtlanticWaterFlow {

    public List<List<Integer>> findWaterFlow(int[][] heights){


        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];

        for(int col = 0; col<cols; col++){
            dfs(0, col, rows, cols, pac, heights[0][col], heights);
            dfs(rows-1, col, rows, cols, atl, heights[rows-1][col], heights);
        }

        for(int row = 0; row<rows; row++){
            dfs(row, 0, rows, cols, pac, heights[row][0], heights);
            dfs(row, cols-1, rows, cols, atl, heights[row][cols-1], heights);
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0;i<rows;i++){
            for(int j=0; j<cols; j++){
                if(pac[i][j] && atl[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }

    public void dfs(int row, int col, int rows, int cols, boolean[][] visited, int prev, int[][] heights){

        if(row<0 || col<0 || row>= rows || col>= cols || visited[row][col] || prev>heights[row][col]){
            return;
        }
        visited[row][col] = true;
        dfs(row+1, col, rows, cols, visited, heights[row][col], heights);
        dfs(row-1, col, rows, cols, visited, heights[row][col], heights);
        dfs(row, col+1, rows, cols, visited, heights[row][col], heights);
        dfs(row, col-1, rows, cols, visited, heights[row][col], heights);
    }



    public static void main(String[] args) {

        PacificAtlanticWaterFlow pacificAtlanticWaterFlow = new PacificAtlanticWaterFlow();
        int[][] matrix = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        List<List<Integer>> mat= pacificAtlanticWaterFlow.findWaterFlow(matrix);
        System.out.println("target element: " + mat);


    }
}
