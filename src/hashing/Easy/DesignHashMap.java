package hashing.Easy;

//Design a HashMap without using any built-in hash table libraries.
public class DesignHashMap {

    int[] hash;

    public DesignHashMap() {
        hash = new int[10000000];

    }

    public void put(int key, int value) {
        hash[key] = value+1;
    }

    public int get(int key) {
        return hash[key]-1;
    }

    public void remove(int key) {
        hash[key] = 0;
    }
}
