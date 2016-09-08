public class ReverseNumber {
    public int ReverseNumber(int value){
        if (value<0){
            throw new IllegalArgumentException("negative numbers not allowed");
        }
        int result =0;
        while (value!=0){
            result*=10;
            result+=value%10;
            value/=10;
        }
        return result;
    }
}
