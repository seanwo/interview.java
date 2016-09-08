import java.util.HashMap;

public class FindRepeatingChars {
    public HashMap<Character, Integer> FindRepeatingChars(String str){
        if (null == str) {
            throw new IllegalArgumentException("input value is null");
        }

        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            int frequency = 1;
            char c = str.charAt(i);
            if (frequencyMap.containsKey(c)){
                frequency+=frequencyMap.get(c);
            }
            frequencyMap.put(c,frequency);
        }
        Character[] keys = frequencyMap.keySet().toArray(new Character[0]);
        for(Character e: keys){
            if (frequencyMap.get(e)<=1){
                frequencyMap.remove(e);
            }
        }
        return frequencyMap;
    }
}
