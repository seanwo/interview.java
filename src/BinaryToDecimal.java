public class BinaryToDecimal {
    public int BinaryToDecimal(int value)
    {
        int sum = 0;
        int count = 0;

        while (0!=value){
            if (1==(value%10)){
                sum+=Math.pow(2,count);
            }
            count++;
            value/=10;
        }

        return sum;
    }
}
