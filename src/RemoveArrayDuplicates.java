import java.util.HashSet;

public class RemoveArrayDuplicates {
    public Integer[] RemoveArrayDuplicates(Integer[] values){

        if (null == values) {
            throw new IllegalArgumentException("array is null");
        }

        HashSet<Integer> set = new HashSet<>();

        for (Integer e: values)
        {
            if (set.contains(e)) continue;
            set.add(e);
        }

        return set.toArray(new Integer[0]);
    }
}
