package Lab1;

import static java.sql.DriverManager.println;

public class Animal {

    static void classMethod() { println("static Animal"); }
    void instanceMethod()  { println("instance Animal");}
}
class Cat extends Animal {
    static void classMethod() { println("static Cat");}
    void instanceMethod() { println("instance Cat");}
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        myAnimal.instanceMethod();
        Animal.classMethod();
    }
}
