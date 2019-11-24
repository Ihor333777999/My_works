package ScannerAndIncrement;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes :  " );
        int min = input.nextInt();
        int hours  = min/60;
        int renindingMinutes = min % 60;

        System.out.println(min + "  minute is  " + hours + "  hours and  " + renindingMinutes  +   "  minutes  ");

    }
}
