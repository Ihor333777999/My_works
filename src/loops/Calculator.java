package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner  input = new Scanner( System.in);
        System.out.println("Enter any positive integer:");
        int number = input.nextInt();
        for(int i=1;i<11;i++){
            int calculator = number * i;
            System.out.println( number+  "*" + i + "=" +calculator);
        }
    }
}
