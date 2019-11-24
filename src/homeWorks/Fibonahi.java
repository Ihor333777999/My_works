//Input:
//        6
//        Output:
//        0 1 1 2 3 5
package homeWorks;

import java.util.Scanner;

public class Fibonahi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int Number1 = 0;
        int Number2 = 1;

        for (int i = 1; i <= number; i++)
                {

                    System.out.print(Number1 +"  ");

                    int sum = Number1  + Number2 ;

                    Number1  = Number2 ;

                    Number2  = sum;
                   // System.out.print(Number1 +"  ");
            }

        }}