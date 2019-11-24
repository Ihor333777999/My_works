package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zombies1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[3];
int [] res = new int [3];

        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();

do{

    for (int j =1;j<=res[j];j++)
    res[i] = inhabitants[i]/2;


        }while (res[i]==0);
        System.out.println(Arrays.toString(inhabitants));
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res));
    }
}}







