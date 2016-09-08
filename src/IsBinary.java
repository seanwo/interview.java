public class IsBinary {
    public boolean IsBinary(int value){
        while (0!=value){
            int tmp = value%10;
            if ((tmp!=0) && (tmp!=1)){
                return false;
            }
            value/=10;
        }
        return true;
    }
}
