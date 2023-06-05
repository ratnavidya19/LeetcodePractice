package BFS.Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
// Answers within 10-5 of the actual answer will be accepted.
public class AverageOfLevelsInBinaryTree {

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

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int count = 0;
            long sum = 0;
            int size = q.size();
            while(size-- > 0)
            {
                TreeNode level = q.remove();
                sum += level.val;
                count++;
                if(level.left != null)
                {
                    q.add(level.left);
                }
                if(level.right != null)
                {
                    q.add(level.right);
                }
            }
            result.add(sum *1.0/count);
        }
        return result;

    }
}
