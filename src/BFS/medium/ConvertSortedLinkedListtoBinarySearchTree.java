package BFS.medium;


import java.util.ArrayList;

public class ConvertSortedLinkedListtoBinarySearchTree {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


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

    public TreeNode sortedListToBST(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }

        return createBST(list, 0, list.size()-1);
    }

    public TreeNode createBST(ArrayList<Integer> list, int start, int end){

        if(start > end){
            return null;
        }
        int mid = (start+end)/2;

        TreeNode root = new TreeNode(list.get(mid));
        root.left = createBST(list, start, mid-1);
        root.right = createBST(list, mid+1, end);
        return root;
    }
}
