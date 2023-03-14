package BFS.medium;

import javax.swing.tree.TreeNode;
import java.util.*;

//Given the root of a binary tree, the value of a target node target, and an integer k,
// return an array of the values of all nodes that have a distance k from the target node.
//reference - https://www.youtube.com/watch?v=lFW3sbPpMIk&t=770s
public class AllNodesDistanceKinBinaryTree {

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

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<TreeNode, TreeNode> parentmap = new HashMap<>();
        mapParent(root, parentmap);
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0; i<size; i++){
                TreeNode curr = q.poll();
                visited.add(curr);
                if(k==0){
                    result.add(curr.val);
                }
                if(parentmap.containsKey(curr) && (!visited.contains(parentmap.get(curr)))){
                    q.add(parentmap.get(curr));
                }
                if((curr.left!=null) && (!visited.contains(curr.left))){
                    q.add(curr.left);
                }
                if((curr.right!=null) && (!visited.contains(curr.right))){
                    q.add(curr.right);
                }
            }
            k--;
            if(k<0) break;
        }
        return result;
    }

    public void mapParent(TreeNode root, HashMap<TreeNode,TreeNode> map) {
        if(root==null) return;
        if(root.left!=null) map.put(root.left,root);
        if(root.right!=null) map.put(root.right,root);
        mapParent(root.left,map);
        mapParent(root.right,map);
    }
}
