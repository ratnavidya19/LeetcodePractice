package BFS.medium;

import arrays.Medium.FindDuplicateNumber;

import java.util.*;

//Given the root of a binary tree, return the level order traversal of its nodes' values.
// (i.e., from left to right, level by level).
//reference - https://www.youtube.com/watch?v=vQrggrFMyp8&t=373s
public class BinaryTreeLevelOrderTraversal {

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

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> curr_level = new ArrayList();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                curr_level.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            result.add(curr_level);
        }
      //  Collections.reverse(result);

        return result;
    }
}
