package DFS.Medium;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInBST {


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

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        if(k > list.size()){
            return -1;
        }

        return list.get(k-1);
    }

    public void inorder(TreeNode root, List<Integer> list){
        if(root != null){
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);

        }
    }
}
