package arrays;

import loops.Scaner15times;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class convertDecimalToBinary {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];
int [] binary2 = new int [8];
        //TODO: Write your code below.
        binary[0] = 128;
        binary[1] = 64;
        binary[2] = 32;
        binary[3] = 16;
        binary[4] = 8;
        binary[5] = 4;
        binary[6] = 2;
        binary[7] = 1;


        for (int i = 0; i < binary.length; i++) {
            for (int j=0;j<binary2.length;j++){
binary2[j]=binary[i];
                if (binary[i]>0){
                    binary2[j] = binary[i] - decimal;
                }
            }


        }
        System.out.println(Arrays.toString(binary));
        System.out.println(Arrays.toString(binary2));
    }
}



