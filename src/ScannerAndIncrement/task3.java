package ScannerAndIncrement;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter youre age:  ");
        int age = input.nextInt();
        int retairmentAge = 65;
        int result = retairmentAge - age;

        System.out.println("Becouse you are  " + age+ ",you will retaire" + result+ "years");
    }
}
