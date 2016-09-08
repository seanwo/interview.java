public class SumDigitsRecursive {
    public int SumDigits(int value){
        if (value<0){
            throw new IllegalArgumentException("no negative values");
        }
        if (0==value) return 0;
        return value%10 + SumDigits(value/10);
    }
}
