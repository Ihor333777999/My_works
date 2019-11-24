package homeWorks;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // System.out.println("enter 1:");
        int num1 = input.nextInt();
        // System.out.println("enter run 2:");
        int num2 = input.nextInt();
        int mult = 1;
        for (int i = 1; i <= num2; i++) {
            mult= mult * num1;
           // System.out.println("Result: "+mult);
        }
        System.out.println("Result: "+mult);
    }
}
