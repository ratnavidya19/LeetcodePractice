package linkedlist.Medium;

import java.util.HashMap;
import java.util.Map;

//Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
//Implement the LRUCache class:
//Youttube  - https://www.youtube.com/watch?v=NDpwj0VWz1U
public class LRUCache {


    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    Map<Integer, Node> map;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            add(node);
            return node.value;
        }
        else
        {
            return -1;
        }
    }

    public void put(int key, int value) {

        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == capacity){
            remove(tail.prev);
        }
        add(new Node(key, value));
    }

    public void add(Node node){

        map.put(node.key, node);
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;

    }

    public void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    class Node{

        int key, value;
        Node next;
        Node prev;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
}
