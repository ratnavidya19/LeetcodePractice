package DFS.Medium;

import java.util.ArrayList;

public class AllPathsFromRootToLeaf {

    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }



    public ArrayList<ArrayList<Integer>> Paths(Node root){
        // Code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> inner_list = new ArrayList<>();

        if(root == null){
            return list;
        }
        dfs(root, list, inner_list);
        return list;

    }

    public void dfs(Node root, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> inner_list){

        if(root == null){
            return;
        }
        inner_list.add(root.data);
        if(root.left == null && root.right == null){
            list.add(new ArrayList<Integer>(inner_list));
        }

        dfs(root.left, list, new ArrayList<Integer>(inner_list));
        dfs(root.right, list, new ArrayList<Integer>(inner_list));


    }
}
