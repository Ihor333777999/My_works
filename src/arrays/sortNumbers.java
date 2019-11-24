//Given an array with the value of: 31, 20, 25, 20, 3, 48, 26, 12
//        Print out the biggest and smallest values in the array

        package arrays;

import java.util.Arrays;

public class sortNumbers {
    public static void main(String[] args) {
        int [] numb = {31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort(numb);
        System.out.println("Biggest number "+ numb[numb.length-1]);
        System.out.println("Smalles number " +numb[0]);
}}
