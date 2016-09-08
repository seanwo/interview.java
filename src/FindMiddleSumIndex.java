public class FindMiddleSumIndex {

    public class NoMiddleException extends Exception{
        public NoMiddleException(String msg){
            super(msg);
        }
    }

    public int FindMiddleSumIndex(Integer[] values) throws NoMiddleException {

        if (null == values) {
            throw new IllegalArgumentException("input array is null");
        }
        for (int index = 0; index < values.length; index++) {
            int frontsum = 0;
            for (int i = 0; i <= index; i++) {
                frontsum += values[i];
            }
            int backsum = 0;
            for (int j = index + 1; j < values.length; j++) {
                backsum += values[j];
            }
            if (frontsum == backsum) {
                return index;
            }
        }

        throw new NoMiddleException("No Middle Index");
    }
}
