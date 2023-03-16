package BFS.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphValidTree {
    public boolean IsGraphValid(int n, int[][] edges){

        if(n == 0)
        {
            return true;
        }
        if(edges.length != n-1){
            return false;
        }

        List<List<Integer>> adjList = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        //initialize
        for(int i = 0; i<n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for(int i = 0; i<n; i++){
            if(!visited.contains(i)){
                return false;
            }
        }
        hasCycle(adjList, 0, visited, -1);
        return visited.size()==n && edges.length == n-1;

    }

    public void hasCycle(List<List<Integer>> adjList, int node, Set<Integer> visited, int parent){
        if(visited.contains(node))
            return;
        visited.add(node);
        for(int edge : adjList.get(node)){
            hasCycle(adjList, edge, visited, node);
        }
    }

    public static void main(String args[])
    {

    }
}
