public class Sort {
    public int[] SimpleSort(int[] values){
        if (null==values){
            throw new IllegalArgumentException("null values not permitted");
        }
        for (int i=0; i<values.length-1; i++){
            for (int j=i+1; j<values.length; j++){
                if (values[j]<values[i]){
                    int tmp = values[i];
                    values[i]=values[j];
                    values[j]=tmp;
                }
            }
        }
        return values;
    }

    public int[] BubbleSort(int[] values){
        if (null==values){
            throw new IllegalArgumentException("null values not permitted");
        }

        for (int i=1; i<values.length; i++) {
            boolean bSwap=false;
            for (int j = 0; j < values.length-i; j++) {
                if (values[j]>values[j+1]){
                    int tmp = values[j+1];
                    values[j+1]=values[j];
                    values[j]=tmp;
                    bSwap=true;
                }
            }
            if (!bSwap) break;
        }
        return values;
    }

    public int[] InsertionSort(int[] values){
        if (null==values){
            throw new IllegalArgumentException("null values not permitted");
        }

        for (int i=1; i<values.length; i++){
            int e=values[i];
            int j=i;
            while ((j>0) &&(e<values[j-1])){
                values[j]=values[j-1];
                j--;
            }
            values[j]=e;
        }
        return values;
    }
}
