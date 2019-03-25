package Lab1;

public class FizzBuzz {
}
class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            String formatted = String.format("%03d", i);
            System.out.println(formatted);
        }
    }
}