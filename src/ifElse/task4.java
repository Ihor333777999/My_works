package ifElse;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();

        int countEven = 0;
        int countOdd = 0;

        if (number1 % 2 == 0){
             countEven++;
        }
        else{

            countOdd ++;
        }
        if (number2 % 2 == 0){
            countEven++;
        }
        else{

            countOdd ++;
        }
        if (number3 % 2 == 0){
            countEven++;
        }
        else{

            countOdd ++;
        }
        if (number4 % 2 == 0){
            countEven++;
        }
        else{

            countOdd ++;
        }
        if (number5 % 2 == 0){
            countEven++;
        }
        else{

            countOdd ++;
        }
        System.out.println("total evens value : "+countEven);
        System.out.println("total evens value : "+countOdd);

        }
    }

