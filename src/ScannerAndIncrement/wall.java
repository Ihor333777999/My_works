package ScannerAndIncrement;

import java.util.Scanner;

public class wall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whot is the wooll color?   ");
        String color = input.nextLine();
        System.out.println("What is the lenghr?  ");
        int lenght = input.nextInt();
        input.nextLine();
        System.out.println("is the good one?  ");
        String answer = input.nextLine();
        System.out.println("color: " + color);
        System.out.println("lenght: " + lenght);
        System.out.println("good?  " + answer);
    }
}
