//Create a method that prints “Hello” 50 times
//        Create a method that print odd numbers up to 100.
package methods;

public class oddNumberUpTo100 {
    public static void main(String[] args) {
        hello();
        printOddNumber();
    }

    public static void hello() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Hello" +(i +1));

        }
    }

    public static void printOddNumber() {
        int odd;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("odd " + i);
                System.out.println("");

            }
        }
    }
}