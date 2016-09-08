public class ReverseString {
    public String ReverseString(String str){
        if (null==str) return null;
        String retval = "";
        for (int i=0; i<str.length(); i++){
            retval+=str.charAt(str.length()-1-i);
        }
        return retval;
    }
}
