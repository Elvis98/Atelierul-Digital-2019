package Lab3;

public class Main {
    public static void main(String[] args){
        LazySingleton s1= LazySingleton.getInstance();
        LazySingleton s2= LazySingleton.getInstance();

        if(s1 == s2){
            System.out println("Same objects");

        }else{
            System.out println("Not the same");
        }
    }
}
