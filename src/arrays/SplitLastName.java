package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitLastName {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {

          String[] rel = info.split(",");

            System.out.println(Arrays.toString(rel));
        System.out.print("person name: "+rel[0]);
        System.out.print(" last name: "+ rel[1]);
        System.out.print(" age: "+ rel[2]);






    }
}
