package assignment;

public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
class Test{
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
         Singleton obj1=Singleton.getInstance();
    }
}


