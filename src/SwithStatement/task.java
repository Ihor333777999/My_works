package SwithStatement;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter letter a,b,c,");
        char letter = input.nextLine().charAt(0);

        switch (letter){
            case 'A':
            case 'a':
                System.out.println("exelent");
                break;
            case 'B':
            case 'b':
                System.out.println("Great");
                break;
            case 'C':
            case 'c':
                System.out.println("okay");
                break;

            default:

                System.out.println("invalid letter");



        }
    }
}
