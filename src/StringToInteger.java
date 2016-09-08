public class StringToInteger {
    public int atoi(String str){
        int retval = 0;
        if (null == str)
        {
            throw new IllegalArgumentException("Input value is null");
        }
        str = str.trim();
        if (0==str.length()){
            throw new IllegalArgumentException("Input value is empty");
        }

        int neg = 1;
        int sum = 0;
        int index = 0;

        if ('-'==str.charAt(index)){
            neg = -1;
            index++;
        }

        while (index<str.length()){
            char tmp = str.charAt(index);
            if ((tmp<'0') || (tmp>'9')){
                throw new IllegalArgumentException("String contains non numeric characters");
            }
            sum*=10;
            sum+=tmp-'0';
            index++;
        }

        retval = neg * sum;

        return retval;
    }
}
