import java.beans.FeatureDescriptor;
import java.lang.reflect.Array;
import java.util.*;

public class WordFrequency {

    public static class FrequencyEntity{
        public FrequencyEntity(String value, Integer count){
            this.count=count;
            this.value=value;
        }
        public String value;
        public Integer count;
    }

    public ArrayList<FrequencyEntity> WordFrequency(String str){

        if (null==str){
            throw new IllegalArgumentException("null input not allowed");
        }

        HashMap<String, Integer> freq = new HashMap<>();
        StringTokenizer st = new StringTokenizer(str," ()&!.,?;:\"\'");
        while (st.hasMoreElements()){
            int count = 1;
            String e = st.nextToken();
            if (freq.containsKey(e)){
                count+=freq.get(e);
            }
            freq.put(e,count);
        }

        ArrayList<FrequencyEntity> freqList = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> it = freq.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry me = it.next();
            FrequencyEntity fe = new FrequencyEntity((String)me.getKey(), (Integer)me.getValue());
            freqList.add(fe);
        }

        freqList.sort(new Comparator<FrequencyEntity>() {
            @Override
            public int compare(FrequencyEntity o1, FrequencyEntity o2) {
                return (o2.count-o1.count);
            }
        });

        return freqList;
    }
}
