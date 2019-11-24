//1) Write a program that asks the user to enter a number. The number will be how big your square will be. Square made of ‘#’ sign
//        > input: 5
//        > output:
//        # # # # #
//        # # # # #
//        # # # # #
//        # # # # #
//        # # # # #
package loops;

import java.util.Scanner;

public class loopMalunok {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        System.out.println("          *************".substring(i, 4 + 2*i));

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number");
//        int num = input.nextInt();
//        for(int i=0; i < num; i++) {
//            for(int j=0; j < num; j++) {
//                System.out.print("# ");
//            }
//            System.out.println();
//        }
    }
}
