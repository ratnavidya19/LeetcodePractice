package BFS.Easy;

public class ConvertSortedArraytoBinarySearchTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length == 0){
            return null;
        }

        return createBST(nums, 0, nums.length-1);


    }

    public TreeNode createBST(int[] nums, int start, int end){

        if(start > end){
            return null;
        }
        int mid = (start+end)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, start, mid-1);
        root.right = createBST(nums, mid+1, end);
        return root;
    }
}
