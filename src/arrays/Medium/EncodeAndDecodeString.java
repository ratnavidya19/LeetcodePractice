package arrays.Medium;

import java.util.ArrayList;
import java.util.List;

//Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the
// network and is decoded back to the original list of strings.
public class EncodeAndDecodeString {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {

        StringBuffer out = new StringBuffer();
        for(String s:strs){
            out.append(s.replace("#","##")).append(" # ");
        }
        return out.toString();

    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List list = new ArrayList();
        String[] array = s.split(" # ",-1);
        for(int i = 0; i< array.length-1; i++){
            list.add(array[i].replace("##","#"));
        }
        return list;
    }
}
