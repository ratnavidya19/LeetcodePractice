package arrays.Medium;

import java.util.List;

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
public class SetMatrixZeroes {

    public int[][] setZeroes(int[][] matrix) {

        if(matrix == null || matrix.length == 0)
        {
            return null;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 1 && col == 1){
            return null;
        }

        boolean isFirstColZero = false;
        for(int i=0; i<row; i++){
            if(matrix[i][0] == 0){
                isFirstColZero = true;
            }
            for(int j=1; j<col;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=row-1; i>=0; i--){
            for(int j=col-1; j>=0; j--){

                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            if(isFirstColZero){
                matrix[i][0] = 0;
            }


        }

        return matrix;
    }

    public static void main(String[] args) {

        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] mat = setMatrixZeroes.setZeroes(matrix);





    }
}
