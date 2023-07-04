package Trie.Medium;

import java.util.HashSet;

//A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a
// dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.
//Time complexity:
//insert: O(1)
//search: O(1)
//startsWith: O(n)
public class ImplementTrie {

    HashSet<String> set;

    public ImplementTrie() {
        set = new HashSet<>();
    }

    public void insert(String word) {
        set.add(word);
    }

    public boolean search(String word) {
        if(set.contains(word)){
            return true;
        }else
        {
            return false;
        }
    }

    public boolean startsWith(String prefix) {
        for(String s:set){
            if(s.startsWith(prefix)){
                return true;
            }
        }
        return false;
    }
}
