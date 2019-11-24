package ifElse;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
//        if (4 == 5){
//            System.out.println("ok");
//        }
//        else {
//            System.out.println("thank");
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("pleace enter code");
        int passCode = input.nextInt();


        if (passCode < 0) {
            System.out.println("No neggative number");

        } else if (passCode < 1000) {
            System.out.println("less");

        } else if (passCode > 9999) {
            System.out.println("moree");
        }
        else {
            System.out.println("you goood");
        }
    }
}