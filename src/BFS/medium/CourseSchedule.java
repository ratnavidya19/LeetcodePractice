package BFS.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where
// prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
//Time complexity = O(V+E)
public class CourseSchedule {
//
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        if(prerequisites == null || prerequisites.length == 0) return true;
//
//        boolean[][] adj = new boolean[numCourses][numCourses];
//        for(int i = 0; i < prerequisites.length; i++){
//            adj[prerequisites[i][0]][prerequisites[i][1]] = true;
//        }
//
//        boolean[] visited = new boolean[numCourses];
//        boolean[] explored = new boolean[numCourses];
//        for(int i = 0; i < numCourses; i++){
//            if(!visited[i] && isCyclic(adj, i, visited, explored)){
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    boolean isCyclic(boolean[][] adj, int i, boolean[] visited, boolean[] explored){
//        visited[i] = true;
//        for(int j = 0; j < adj.length; j++){
//            if(adj[i][j]){
//                if(!visited[j]){
//                    if(isCyclic(adj, j, visited, explored)) return true;
//                }
//                else if(!explored[j]) return true;
//            }
//        }
//        explored[i] = true;
//        return false;
//    }


    boolean cycle = false;

    public boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int[] edgelist: prerequisites){
            int u = edgelist[1];
            int v = edgelist[0];

            graph.get(u).add(v);
        }

        boolean[] visited = new boolean[n];
        boolean[] currentPath = new boolean[n];

        for(int i=0;i<n;i++){
            dfs(i, graph, visited, currentPath);
        }


        return !cycle;
    }


    public void dfs(int v, ArrayList<ArrayList<Integer>> g, boolean[] vis, boolean[] cur){
        if(cur[v]){
            cycle = true;
        }

        if(vis[v] || cycle){
            return;
        }

        vis[v] = true;
        cur[v] = true;

        for(int adj: g.get(v)){
            dfs(adj, g, vis, cur);
        }

        cur[v] = false;
    }
}
