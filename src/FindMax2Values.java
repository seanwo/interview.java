public class FindMax2Values {
    public Integer[] FindMax2Values(Integer[] values){
        if ((null==values) || (values.length<2)){
            throw new IllegalArgumentException("input values are invalid");
        }

        Integer[] maxValues = new Integer[2];
        maxValues[0]=Math.max(values[0],values[1]);
        maxValues[1]=Math.min(values[0],values[1]);
        int index = 2;

        while (index<values.length){
            if (values[index]>maxValues[0]){
                maxValues[1]=maxValues[0];
                maxValues[0]=values[index];
            } else if (values[index]>maxValues[1]){
                maxValues[1]=values[index];
            }
            index++;
        }

        return maxValues;
    }
}
