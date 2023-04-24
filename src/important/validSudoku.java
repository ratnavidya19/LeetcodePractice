package important;

import java.util.HashSet;

public class validSudoku {

    public boolean isValidSudoku(int[][] grid){

        if(grid.length != 9 || grid[0].length != 9){
            return false;
        }

        //check if all rows contains values from 1 to 9
        for(int i = 0; i<9; i++){
            HashSet<Integer> rowSet = new HashSet<>();
            for(int j = 0; j<9; j++){
                int num = grid[i][j];
                if(num < 1 || num > 9 || rowSet.contains(num)){
                    return false;
                }
                rowSet.add(num);
            }
        }

        //check if all columns contains values from 1 to 9
        for(int j = 0; j<9; j++){
            HashSet<Integer> colSet = new HashSet<>();
            for(int i = 0; i<9; i++){
                int num = grid[i][j];
                if(num < 1 || num > 9 || colSet.contains(num)){
                    return false;
                }
                colSet.add(num);
            }
        }

        //check if all the sub-grids contains values from 1 to 9
        for(int j = 0; j<9; j+=3){
            for(int i = 0; i<9; i+=3) {
                HashSet<Integer> subgridSet = new HashSet<>();
                for(int k = 0; k<3; k++){
                    for(int l = 0; l<3; l++){
                        int num = grid[i+k][j+l];
                        if(num < 1 || num > 9 || subgridSet.contains(num)){
                            return false;
                        }
                        subgridSet.add(num);
                    }
                }
            }
        }

        return true;
    }
}
