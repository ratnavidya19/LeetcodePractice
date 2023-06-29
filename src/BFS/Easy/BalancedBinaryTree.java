package BFS.Easy;

//Given a binary tree, determine if it is
//time complexity - O(n)
public class BalancedBinaryTree {

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

    public boolean isBalanced(TreeNode root) {


        int diff = bst(root);


        return (diff != -1);
    }

    public int bst(TreeNode root){
        if(root == null) return 0;

        if(root.left == null && root.right == null){
            return 1;
        }

        int left = bst(root.left);
        if(left == -1) return -1;

        int right = bst(root.right);
        if(right == -1) return -1;


        if(Math.abs(left-right) > 1){
            return -1;
        }

        return Math.max(left, right)+1;


    }
}
