package loops;

import java.util.Scanner;

public class WhileLoopCount {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter your address");
        String address = input.nextLine();
        int count = 0;
        while (address.contains("IL")){
            count++;
            System.out.println("Enter your address");
            address = input.nextLine();
        }
        System.out.println(count);
    }
}
