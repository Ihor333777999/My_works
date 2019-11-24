package ifElse;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three numbers");

        int one = input.nextInt();
        int two= input.nextInt();
        int three = input.nextInt();

        int max =0;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        if (one>two && one>three ){
            max = one;
        }
        else if (two>one && two>three){
            max = two;
        }
        else  if (three >one && three>two){
           max = three;
        }
        else if (one == two && one == three){
            System.out.println("All numbers are equal ");
        }
        System.out.println("max number is : "+ max);
    }
}
