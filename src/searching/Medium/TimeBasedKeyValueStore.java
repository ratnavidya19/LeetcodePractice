package searching.Medium;

import java.util.HashMap;
import java.util.TreeMap;

public class TimeBasedKeyValueStore {

    HashMap<String, TreeMap<Integer, String>> hashMap;

    public TimeBasedKeyValueStore() {

        hashMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        if(!hashMap.containsKey(key)){
            TreeMap<Integer, String> treeMap = new TreeMap<>();
            treeMap.put(timestamp, value);
            hashMap.put(key, treeMap);
        }
        else {
            hashMap.get(key).put(timestamp, value);
        }
    }

    public String get(String key, int timestamp) {

        if(hashMap.containsKey(key)){

            if(hashMap.get(key).containsKey(timestamp)){
                return hashMap.get(key).get(timestamp);
            }
            else {
                Integer prevTime = hashMap.get(key).floorKey(timestamp);
                if(prevTime != null){
                    return hashMap.get(key).get(prevTime);
                }
            }
        }
        return "";
    }
}
