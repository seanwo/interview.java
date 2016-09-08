import java.util.ArrayList;

public class Fibonacci {

    public Integer[] Fibonacci(int count){
        ArrayList<Integer> sequence = new ArrayList<>();
        if (count>0){
            sequence.add(0);
            if (count>1){
                sequence.add(1);
                if (count>2){
                    int index = 2;
                    while (index<count){
                        sequence.add(sequence.get(index-2)+sequence.get(index-1));
                        index++;
                    }
                }
            }
        }
        return sequence.toArray(new Integer[0]);
    }
}
