package arrays.Medium;

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//ref - https://www.youtube.com/watch?v=djt9mwch-Xo
public class SetMatrixZeroes {

    public int[][] setZeroes(int[][] matrix) {

        int x = 1,y = 1;
        int row = matrix.length;
        int col = matrix[0].length;

        for(int j=1; j<col;j++) {
            if (matrix[0][j] == 0) {
                x = 0;
            }
        }
        for(int i=0; i<row; i++) {
            if (matrix[i][0] == 0) {
                y = 0;
            }
        }


        for(int i=1; i<row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1; i<row; i++) {
            if(matrix[i][0] == 0){
                for (int j = 1; j < col; j++){
                    matrix[i][j] = 0;
                }

            }
        }

        for(int j=1; j<col; j++) {
            if(matrix[0][j] == 0){
                for (int i = 1; i < row; i++){
                    matrix[i][j] = 0;
                }

            }
        }

        if(x == 0){
            for(int j=0; j<col; j++){
                matrix[0][j] = 0;
            }
        }
        if(y == 0){
            for(int i=0; i<row; i++){
                matrix[i][0] = 0;
            }
        }

        return matrix;

    }

    public static void main(String[] args) {

        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] mat = setMatrixZeroes.setZeroes(matrix);

        for (int i = 0; i < mat.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");



    }
}
