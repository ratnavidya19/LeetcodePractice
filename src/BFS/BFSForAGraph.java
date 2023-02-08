package BFS;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSForAGraph {
    int V;
    LinkedList<Integer> adj[];

    BFSForAGraph(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v;i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int u, int v){

        adj[u].add(v);
    }

    public void BFS(int s){
        boolean visited[] = new boolean[V];
        visited[s] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);

        while(!(queue.size() == 0)){
            s = queue.poll();
            System.out.println(s+" ");

            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                while(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args){

        BFSForAGraph graph = new BFSForAGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        System.out.println(
                "Following is Breadth First Traversal "
                        + "(starting from vertex 2)");

        graph.BFS(2);
    }
}
