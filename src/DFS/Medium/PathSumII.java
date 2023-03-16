package DFS.Medium;

import BFS.medium.BinaryTreeZigzagLevelTraversal;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

//Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values
// in the path equals targetSum. Each path should be returned as a list of the node values, not node references.
//reference - https://www.youtube.com/watch?v=mS-CFA_k1yM
public class PathSumII {

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

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        findSum(root, targetSum, new ArrayList<>(), result);

        return result;
    }

    public void findSum(TreeNode root, int targerSum, List<Integer> path, List<List<Integer>> result){

        if(root == null) return;
        path.add(root.val);
        if(root.left == null && root.right == null && targerSum == root.val){
            result.add(path);
        }

        findSum(root.left, targerSum-root.val, new ArrayList<>(path), result);
        findSum(root.right, targerSum-root.val, new ArrayList<>(path), result);

    }
}
