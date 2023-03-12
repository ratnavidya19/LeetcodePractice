package BFS.medium;

//https://leetcode.com/problems/clone-graph/description/
//reference - https://www.youtube.com/watch?v=0m_eIw_XW9c

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// Definition for a Node.
public class CloneGraph {

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }


        Map<Node, Node> map = new HashMap<>();
        public Node cloneGraph(Node node) {
            if(node == null){
                return null;
            }
            Node newNode = new Node(node.val);
            map.put(node, newNode);
            for(Node n:node.neighbors) {
                if(map.containsKey(n)){
                    newNode.neighbors.add(map.get(n));
                }
                else
                {
                    newNode.neighbors.add(cloneGraph(n));
                }
            }
            return newNode;

        }
}

