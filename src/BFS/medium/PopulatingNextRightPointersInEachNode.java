package BFS.medium;

//You are given a perfect binary tree where all leaves are on the same level, and every parent has two children,Populate
//each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL
//refernce - https://www.youtube.com/watch?v=o-SxW_0E-o8
public class PopulatingNextRightPointersInEachNode {

    public static class Node {
        int val;
        Node left;
        Node right;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }

    public Node connect(Node root) {

        if(root == null || root.left == null || root.right == null){
            return root;
        }

        root.left.next = root.right;
        if(root.next != null){
            root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);

        return root;

    }
}
