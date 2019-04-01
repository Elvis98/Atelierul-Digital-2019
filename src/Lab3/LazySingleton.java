package Lab3;

public class LazySingleton {
    private static final LazySingleton instance = null;
    private LazySingleton() {}

    private static LazySingleton getInstance(){
         if(instance == null){
             instance = new LazySingleton();
         }
    }
    return instance;
}
