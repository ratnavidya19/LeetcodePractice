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
        boolean[] visited = new boolean[n];
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

        if(hasCycle(adjList, 0, visited, -1)){
            return false;
        }
        for(int i = 0; i<n; i++){
            if (!visited[i]) {
                return false;
            }
        }
        return true;

    }

    public boolean hasCycle(List<List<Integer>> adjList, int node, boolean[] visited, int parent){

        visited[node] = true;
        for (int i = 0; i < adjList.get(node).size(); i++) {
            int v = adjList.get(node).get(i);

            if ((visited[v] && parent != v) || (!visited[v] && hasCycle(adjList, v, visited, node)))
                return true;
        }

        return false;
    }
}
