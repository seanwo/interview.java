public class MyArrayList {

    private Object[] list = new Object[0];

    public MyArrayList(){
    }

    public void add(Object obj){
        if (null==obj){
            throw new IllegalArgumentException("object is null");
        }
        Object[] newList = new Object[list.length+1];
        for (int i=0; i<list.length; i++){
            newList[i]=list[i];
        }
        newList[list.length]=obj;
        list=newList;
    }

    public int size() {
        return list.length;
    }

    public Object remove(int index){
        if ((index>=list.length) || (index<0)){
            throw new IndexOutOfBoundsException();
        }
        Object[] newList = new Object[list.length-1];
        int count=0;
        for(int i=0; i<index; i++){
            newList[count++]=list[i];
        }
        for(int i=index+1; i<list.length; i++){
            newList[count++]=list[i];
        }
        Object retval = list[index];
        list=newList;
        return retval;
    }

    public Object get(int index){
        if ((index>=list.length) || (index<0)){
            throw new IndexOutOfBoundsException();
        }
        return list[index];
    }
}
