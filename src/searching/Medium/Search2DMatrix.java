package searching.Medium;

//You are given an m x n integer matrix matrix with the following two properties:
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//You must write a solution in O(log(m * n)) time complexity.
//reference - https://www.youtube.com/watch?v=HxnSEWzBeKI
public class Search2DMatrix {

    public boolean searchTarget(int[][] matrix, int target){

        int m = matrix.length;;
        int n = matrix[0].length;

        int low = 0;
        int high = (m*n)-1;

        while(low <= high){

            int mid = low + (high-low)/2;
            if(matrix[mid/n][mid%n] == target){
                return true;
            } else if (matrix[mid/n][mid%n] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        Search2DMatrix search2DMatrix = new Search2DMatrix();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 1;
        boolean mat = search2DMatrix.searchTarget(matrix, target);
        System.out.println("target element: " + mat);


    }
}
