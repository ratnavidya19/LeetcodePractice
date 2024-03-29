package DFS.Easy;

import DFS.Medium.ValidBinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

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


    public TreeNode invertTree(TreeNode root) {

        if(root == null)
        {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode current = queue.remove();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if(current.left != null)
            {
                queue.add(current.left);
            }
            if(current.right != null)
            {
                queue.add(current.right);
            }
        }
        return root;
    }
}
