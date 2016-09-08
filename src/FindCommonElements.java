import java.util.HashSet;

public class FindCommonElements {
    public Integer[] FindCommonElements(Integer[] a, Integer[] b){

        if ((null==a) || (null==b)) {
            throw new IllegalArgumentException("input lists are invalid");
        }

        HashSet<Integer> common = new HashSet<>();
        for (int ea: a){
            for (int eb: b){
                if (ea==eb){
                    if (common.contains(ea)){
                        break;
                    }
                    common.add(ea);
                }
            }
        }
        return common.toArray(new Integer[0]);
    }
}
