package BFS.Easy;

import kotlin.Pair;

import java.util.LinkedList;
//Given a binary tree, find its minimum depth.
//
//The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
public class MinimumDepthOfBinaryTree {

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

  /*  public int minDepth(TreeNode root) {

        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        if(root == null)
        {
            return 0;
        }
        else
        {
            queue.add(new Pair(root, 1));
        }

        int min_depth = 0;
        while(!queue.isEmpty())
        {
            Pair<TreeNode, Integer> current = queue.remove();
            root = current.getKey();
            min_depth = current.getValue();
            if((root.left == null) && (root.right == null))
            {
                break;
            }
            if(root.left != null)
            {
                queue.add(new Pair(root.left, min_depth + 1));
            }
            if(root.right != null)
            {
                queue.add(new Pair(root.right, min_depth + 1));
            }
        }
        return min_depth;

    } */

    public int minDepth(TreeNode root) {

        // base case: if root is null, return 0
        if(root == null){
            return 0;
        }

        // if root has no children, return 1
        if(root.left == null && root.right == null){
            return 1;
        }

        // if root has no left child, return the min depth of the right subtree + 1
        if(root.left == null){
            return minDepth(root.right) + 1;
        }

        // if root has no right child, return the min depth of the left subtree + 1
        if(root.right == null){
            return minDepth(root.left) + 1;
        }

        // if root has both left and right children, return the min depth of the left and right subtrees + 1
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;

    }
}
