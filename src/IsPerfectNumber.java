public class IsPerfectNumber {
    public Boolean IsPerfectNumber(int value){
        if (value<=0) return false;
        int sum=0;
        for(int i=1; i<value; i++) {
            if (value % i == 0) {
                sum += i;
            }
        }
        return (value==sum);
    }
}
