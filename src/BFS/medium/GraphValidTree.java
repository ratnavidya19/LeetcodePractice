package BFS.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphValidTree {

    Set<Integer> visited;
    List<List<Integer>> adjList;
    public boolean IsGraphValid(int n, int[][] edges){

        if(n == 0)
        {
            return true;
        }
        if(edges.length != n-1){
            return false;
        }

        adjList = new ArrayList<>();
        visited = new HashSet<>();
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

        boolean noCycle = dfs(0);
        return noCycle == true && visited.size() == n;

    }

    public boolean dfs(int node){

        if(visited.contains(node))  return false;

        visited.add(node);

        for (int i = 0; i < adjList.get(node).size(); i++) {
            dfs(i);
        }

        return true;
    }
}
