import java.util.Stack;

public class DecimalToBinary {
    public int DecimalToBinary(int value)
    {
        Stack<Integer> stack = new Stack<>();

        while (0!=value){
            stack.add(value%2);
            value/=2;
        }

        int sum = 0;

        while(!stack.empty()){
            sum*=10;
            sum+=stack.pop();
        }

        return sum;
    }
}
