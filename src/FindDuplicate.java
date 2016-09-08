import java.util.HashSet;

public class FindDuplicate {
    public class NoDuplicateException extends Exception {
        public NoDuplicateException(String msg){
            super(msg);
        }
    }

    public int FindDuplicate(Integer[] values) throws NoDuplicateException{
        HashSet<Integer> set = new HashSet<>();

        if (null==values){
            throw new IllegalArgumentException("bad list");
        }

        for (Integer e: values){
            if (set.contains(e)) {
                return e;
            }
            set.add(e);
        }
        throw new NoDuplicateException("No duplicates!");
    }
}
