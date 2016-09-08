public class ReplaceCharacter {
    public String ReplaceCharacter(String str, char find, char replace){
        if (null==str) {
            throw new IllegalArgumentException("input can not be null");
        }
        String retval = "";
        for (int i=0; i<str.length(); i++){
            char nextChar = str.charAt(i);
            if (str.charAt(i)==find) {
                nextChar=replace;
            }
            retval+=nextChar;
        }
        return retval;
    }
}
