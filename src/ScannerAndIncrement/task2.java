package ScannerAndIncrement;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,day,year;
        System.out.println("Enter month:   ");
        month = input.nextInt();
        System.out.println("Enter day:   ");
        day = input.nextInt();
        System.out.println("Enter year:   ");
        year = input.nextInt();

        year += 5;
        day -= 1;

        String result = ""+ month  + "/"+day+"/"+year;   //storin
        System.out.println(result);                      //vuvid
    }
}
