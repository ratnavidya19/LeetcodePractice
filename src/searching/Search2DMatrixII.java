package searching;

//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.
//reference - https://www.youtube.com/watch?v=dcTJRw1704w
public class Search2DMatrixII {

    public boolean searchTarget(int[][] matrix, int target){

        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0; int c = n-1;
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true;
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }


        public static void main(String[] args) {

            Search2DMatrixII search2DMatrix = new Search2DMatrixII();
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 20;
        boolean mat = search2DMatrix.searchTarget(matrix, target);
        System.out.println("target element: " + mat);


    }
}
