package ScannerAndIncrement;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,day,year;
        System.out.println("Enter month:   ");
        month = input.nextInt();
        System.out.println("Enter day:   ");
        day = input.nextInt();
        System.out.println("Enter year:   ");
        year = input.nextInt();

        String result = ""+ month + "/"+day+"/"+year;
        System.out.println(result);
    }
}
