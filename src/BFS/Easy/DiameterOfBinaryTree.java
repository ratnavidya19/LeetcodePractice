package BFS.Easy;


//Youtube - https://www.youtube.com/watch?v=m-kS6lIGosQ
//Time comp = O(n)

public class DiameterOfBinaryTree {

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


    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        //step 2
        if(root==null) return 0;
        //step 3
        DFS(root);
        //step 8
        return diameter;
    }

    public int DFS(TreeNode root){
        //step 4
        if(root==null) return -1;
        //step 5
        int left = DFS(root.left);
        int right = DFS(root.right);
        //step 6
        // The 2 in the diameter calculation represents the number of edges a node has.
        diameter = Math.max(diameter, left + right + 2);
        //step 7
        return 1 + Math.max(left, right);
    }
}
