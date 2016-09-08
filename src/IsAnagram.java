import java.util.ArrayList;
import java.util.Arrays;

public class IsAnagram {
    public Boolean IsAnagram(String stra, String strb){
        if ((null == stra) || (null == strb)){
            throw new IllegalArgumentException("input values can not be null");
        }

        if (stra.length()!=strb.length()) return false;

        ArrayList<Character> listOfChars= new ArrayList<>();
        for(char c:stra.toCharArray()){
           listOfChars.add(c);
        }
        for(char c:strb.toCharArray()){
            if (!listOfChars.contains(c)) return false;
            listOfChars.remove(listOfChars.indexOf(c));
        }
        return true;
    }
}
