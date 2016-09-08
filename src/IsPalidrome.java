public class IsPalidrome {
    public Boolean IsPalidrome(String str){
        if (null==str){
            throw new IllegalArgumentException("input can not be null");
        }
        for (int i=0; i<str.length()/2; i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }
}
