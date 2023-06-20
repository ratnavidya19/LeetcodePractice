package DFS.Medium;

import BFS.medium.BinaryTreeZigzagLevelTraversal;

//Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
//reference - https://www.youtube.com/watch?v=O2BDQ8hP-MM
//Time complexity: O(h) h is the height of the tree.
public class LowestCommonAncestorOfBinarySearchTree {

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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null)
        {
            return null;
        }

        while(root != null){
            if(root.val < p.val && root.val < q.val){
                root = root.right;
            }
            else if(root.val > p.val && root.val > q.val){
                root = root.left;
            }
            else{
                break;
            }
        }

        return root;

    }
}
