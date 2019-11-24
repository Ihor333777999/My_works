package ifElse;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");

        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}
