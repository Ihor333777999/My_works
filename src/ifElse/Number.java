package ifElse;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number  from 1-7 ");
        int day = input.nextInt();
        String dayString = "";
        boolean valid = true;

        switch (day) {
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                System.out.println("invalid day number");
                valid = false;
        }
        if (valid) {
            System.out.println(day + " is " + dayString);
        }
    }
}