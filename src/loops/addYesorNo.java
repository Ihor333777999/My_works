//Create a program that will continue to add 1 to a number
//        if the user keeps entering “y” or “yes” Number will start at 0. When the user enters “n” or “no” Print out the final number.
//        Flow:
//        Would you like to add 1?
//        > y
//        Would you like to add 1?
//        > y
//        Would you like to add 1?
//        > y
//        Would you like to add 1?
//        > n
//        Your number is: 3

        package loops;

import java.util.Scanner;

public class addYesorNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter y for counting");
        String answer = input.nextLine();

        int count= 0;
        while (answer.equals("y")){
            System.out.println("Enter yes or no");
             answer = input.nextLine();
            count++;

        }if (answer.equals("n")){
            System.out.println("yore number is");
            System.out.println(count);
        }else{
            System.out.println("bed  number");
        }
    }
}//                           teather input
//  System.out.println("Would you like to add 1");
//          String check = input.nextLine();
//          int number = 0;
//          while (check.equals("yes") || check.equals("y")) {
//          number++;
//          System.out.println("Would you like to add 1");
//          check = input.nextLine();
//          }
//          System.out.println("Your number is: " + number);
