package arrays.Medium;

import java.util.ArrayList;
import java.util.List;
//Given an m x n matrix, return all elements of the matrix in spiral order.
//ref = https://www.youtube.com/watch?v=1ZGJzvkcLsA
public class SpiralMatrix {

    public List<Integer> getSpiralMatrix(int[][] matrix){

        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col-1;
        int dir = 0;
        while(top<=bottom && left<=right){

            if(dir == 0){
                for(int i=left; i<=right; i++)
                {
                    list.add(matrix[top][i]);
                }
                top++;

            }
            else if(dir == 1){
                for(int i=top; i<=bottom; i++)
                {
                    list.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir == 2){
                for(int i=right; i>=left; i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(dir == 3){
                for(int i=bottom; i>=top; i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }
            dir = (dir+1) % 4;
        }

        return list;

    }


    public static void main(String[] args) {

        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> mat = spiralMatrix.getSpiralMatrix(matrix);
        System.out.println("spiral matrix number: " + mat);


    }
}
