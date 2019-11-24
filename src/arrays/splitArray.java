package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class splitArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();


        String z = "@";


        int count = 0;
        String[] array = email.split(" ");

        for (int i = 0; i<= array.length; i++) {
           if( array[i].contains(z)){

                count++;
            }
            System.out.println(count);
        System.out.println(Arrays.toString(array));

            if (email.contains(z) && count == 1) {

                String[] str = email.split(z);

                System.out.println(str[0]);

                System.out.println(str[1]);


            } else {
                System.out.println("Invalid date");

            }
        }}
        }

