package DFS.Medium;

import java.util.HashMap;

public class ConstructBinaryTreefromPreorderandInorderTraversal {

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

    HashMap<Integer, Integer> hm = new HashMap<>();
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length; i++){
            hm.put(inorder[i],i);
        }

        return buildTree(preorder, inorder, 0, inorder.length-1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int start, int end){
        if(start > end) return null;

        TreeNode root = new TreeNode(preorder[preIndex++]);

        if(root == null) return null;

        if(start == end) return root;

        int index = hm.get(root.val);
        root.left = buildTree(preorder, inorder, start, index-1);
        root.right = buildTree(preorder, inorder, index+1, end);
        return root;

    }
}
