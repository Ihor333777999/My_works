//Given the String:
//        "Write a program that creates a group of given size thisisabigword”
//        Find the biggest word in your String and print it.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindeBiggerWord {
    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                String[] words = new String[5];

                int biggestLength = 0;
                String biggestWord = "";

                for(int i = 0; i < 5;  i++) {

                    words[i] = input.nextLine();

                    if(words[i].length() > biggestLength) {
                        biggestLength = words[i].length();
                        biggestWord = words[i];
                    }}

                System.out.println(biggestWord);
            }

        }


