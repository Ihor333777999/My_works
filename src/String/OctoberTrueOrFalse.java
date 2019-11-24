
//You have a value that hold what month it is (October). Ask the user to enter the month from the console.
// If the user’s input matches the expected month put print true, but if the input does not match the actual month print false.
// Uppercase and lowercase letters do not matter, we only care about the value.
        package String;

import java.util.Scanner;

public class OctoberTrueOrFalse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = " October";
        System.out.println("Enter number of month");
       String  user = input.nextLine();
        boolean check = user.equalsIgnoreCase(month);
        System.out.println(check);
    }
}
