package ifElse;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean check;
        System.out.println("enter time");
        int time = input.nextInt();

        if (time >= 8 && time <= 23) {
            check = true;
        } else {
            check = false;
        }
        if (check) {
            System.out.println("Campus is open");
        } else {
            if (time < 0 || time > 24) {
                System.out.println("Invalid time");
            } else {
                System.out.println("Compus is closed");

            }
        }
    }
}