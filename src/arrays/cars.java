//Write a program that asks the number of cars user has and create an array of String with given size.
//        Then ask the user to enter each car. After getting all the cars, print the array.
//        Flow: Enter number of cars: > 3 Enter car 1: > BMW Enter car 2: > Mercedes Enter car 3: > Toyota
//        [BMW, Mercedes, Toyota]
package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class cars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number");
////        int number = input.nextInt();
////
////        String [] garage = new String[4];
////        garage[1] = "toyota";
////        garage [2]= "hyndai";
////        garage[3] = "bmv";
////
////
////        if (number ==1){
////            System.out.println(garage[1]);
////        }else if (number==2){
////            System.out.println(garage[2]);
////        }else if (number==3){
////            System.out.println(garage[3]);
////        }else {
////            System.out.println("invalid number");
////        }

        System.out.println("Enter the number of cars");
        int size = input.nextInt();
        input.nextLine();
        String [] myCars = new String[size];
        for(int i= 0; i < myCars.length; i++) {
            System.out.println("Enter car " + (i+1));
            String car = input.nextLine();
            myCars[i] = car;
        }
        System.out.println(Arrays.toString(myCars));

    }
}
