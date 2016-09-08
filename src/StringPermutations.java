import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringPermutations {

    public String[] Permutations(String str){
        if (null==str){
            throw new IllegalArgumentException("null input not allowed");
        }
        ArrayList<String> permuations = new ArrayList<>();
        permuations = Perms("", str, permuations);
        return permuations.toArray(new String[0]);
    }

    private ArrayList<String> Perms(String prefix, String str, ArrayList<String> permutations){
        if (0 == str.length()){
            permutations.add(prefix);
            return permutations;
        }
        for (int i=0; i<str.length();i++){
            permutations=Perms(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1), permutations);
        }
        return permutations;
    }
}
