package Lab3.Decorator;

import Lab3.Decorator;

public class Main {
    public static void main(String [] args) {
        Decorator Darkroast = new DarkRoast();
        Decorator milk = new Milk(description "Fat milk", cost 2, Whip);
        Decorator mocha = new Mocha(description "mocha", cost 3, Mocha);
        System.out.println();
    }
}
