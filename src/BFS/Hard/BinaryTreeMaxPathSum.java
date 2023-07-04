package BFS.Hard;

public class BinaryTreeMaxPathSum {

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

    public int maxPathSum(TreeNode root) {

        int ans = Integer.MIN_VALUE;
        findmaxPath(root,ans);
        return ans;
    }

    public int findmaxPath(TreeNode root, int ans){

        if(root == null) return 0;
        int left = findmaxPath(root.left, ans);
        int right = findmaxPath(root.right, ans);
        int straightPath = Math.max(root.val, Math.max(root.val+left, root.val+right));
        int curvedPath = root.val + left + right;

        ans = Math.max(ans, Math.max(straightPath, curvedPath));
        return straightPath;


    }

}
