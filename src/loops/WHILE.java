// Write a program that asks the user to enter a number more than 0. Print the all the numbers from 0 to the entered number.
package loops;

import java.util.Scanner;

public class WHILE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = input.nextInt();
        int i =0;
while ( i < number){
    System.out.println(number+i++);//error(


        }
    }
}