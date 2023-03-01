package arrays.Medium;

//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
// ref - https://www.youtube.com/watch?v=MtXQliqPJD8
public class RotateImage {

    public int[][] getRotateImage(int[][] matrix){

        int n = matrix.length;

        //transpose
        for(int i = 0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse columns
        for(int i = 0; i<n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

        return matrix;

    }

    public static void main(String[] args) {

        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat = rotateImage.getRotateImage(matrix);

        for (int i = 0; i < mat.length; i++)

            //Loop through all elements of current row
            for (int j = 0; j < mat.length; j++)
                System.out.print(mat[i][j] + " ");



    }
}
