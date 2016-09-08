import java.util.HashMap;

public class FindLongestUniqueSubstring {
    public String FindLongestUniqueSubstring(String str){
        if (null==str) {
            throw new IllegalArgumentException("string can not be null");
        }

        HashMap<Character, Integer> charMap = new HashMap<>();
        int maxSize = 0;
        int maxIndex = 0;
        int startingIndex = 0;

        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if (charMap.containsKey(c)){
                if (charMap.size()>maxSize){
                    maxSize=charMap.size();
                    maxIndex=startingIndex;
                }
                i = charMap.get(c);
                charMap.clear();
                startingIndex=i+1;
            } else {
                charMap.put(c,i);
            }
        }

        if (charMap.size()>maxSize){
            maxSize=charMap.size();
            maxIndex=startingIndex;
        }

        String retval = "";
        for (int i=0; i<maxSize; i++){
            retval+=str.charAt(maxIndex+i);
        }

        return retval;
    }
}
