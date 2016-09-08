public class Singleton {
    private static Singleton instance = null;

    private Singleton(){}

    public static synchronized Singleton GetInstance(){

        if (null==instance){
            instance = new Singleton();
        }
        return instance;
    }
}
