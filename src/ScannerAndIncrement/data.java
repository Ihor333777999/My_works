package ScannerAndIncrement;

import java.util.Scanner;

public class data {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is yore name:   ");
        String name = input.nextLine();
        System.out.println("Hello :  " +name+ "!");
        System.out.println("How old are you?   ");
        int age = input.nextInt();
        System.out.println("Not to old  :   " +age);

    }

}
