package DFS.Medium;

import java.util.ArrayList;
import java.util.List;

public class MaximumWidthBinaryTree {

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

    public int widthOfBinaryTree(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        int maxWidth = dfs(root, 0, 1, list);

        return maxWidth;
    }

    public int dfs(TreeNode root, int level, int id, List<Integer> list){
        if(root == null) return 0;
        if(level == list.size()){
            list.add(id);
        }
        int curr = id - list.get(level) + 1;
        int left = dfs(root.left, level+1, 2*id, list);
        int right = dfs(root.right, level+1, 2*id+1, list);

        return Math.max(curr, Math.max(left, right));
    }
}
