package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndSecondLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine()};
String [] cha =words;
        for (int i = 0; i < 5; i++){

String first= cha[i].substring(0,1);
String second = cha[i].substring( words[1].length() -1);
String result = first+second+",";
            System.out.print(result);






        }
    }
}
