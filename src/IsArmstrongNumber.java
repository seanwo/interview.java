public class IsArmstrongNumber {
    public boolean IsArmstrongNumber(int value){
        int original = value;
        int digits = 0;
        while (value!=0){
            value/=10;
            digits++;
        }
        value = original;
        int sum = 0;
        while (value!=0){
            sum+=Math.pow(value%10,digits);
            value/=10;
        }
        return (sum==original);
    }
}
