public class ReverseStringRecursive {

    public String ReverseString(String str){
        if ((null==str) || (str.length()<1)) return str;
        return ReverseString(str.substring(1,str.length()))+str.charAt(0);
    }

}
