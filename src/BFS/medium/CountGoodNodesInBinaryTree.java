package BFS.medium;

//Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with
// a value greater than X.
//Return the number of good nodes in the binary tree.
//Youtube - https://www.youtube.com/watch?v=EPmPPrw8pmY
//Time complexity - O(n) height of the tree
public class CountGoodNodesInBinaryTree {
    public static class TreeNode {
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
    int count;
    public int goodNodes(TreeNode root) {
        if(root==null)
            return 0;

        count=0;
        helper(root,Integer.MIN_VALUE);
        return count;
    }

    void helper(TreeNode root,int max) {
        if(root==null)
            return;

        if(root.val >= max){
            count++;
            max = root.val;
        }
        helper(root.left,max);
        helper(root.right,max);

    }
}
