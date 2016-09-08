public class IsPrime {
    public boolean IsPrime(int value){
        if (value==1) return false;
        for(int i=2; i<value; i++){
            if (value%i==0){
                return false;
            }
        }
        return true;
    }
}
