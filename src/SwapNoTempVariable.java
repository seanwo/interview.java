public class SwapNoTempVariable {
    public Integer[] SwapNoTempVariable(Integer[] pair){
        if (null==pair){
            throw new IllegalArgumentException("invalid input");
        }
        pair[1]+=pair[0];
        pair[0]=pair[1]-pair[0];
        pair[1]=pair[1]-pair[0];
        return pair;
    }
}
