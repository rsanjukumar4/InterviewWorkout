public class Singleton {

    private static Singleton obj;
    private Singleton() {
    }

    public synchronized Singleton getInstance() {
        if(obj == null) {
            obj = new Singleton();
        }
        return obj;
    }


}
