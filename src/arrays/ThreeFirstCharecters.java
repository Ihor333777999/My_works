//The code provided in your main method will take in five Strings and save them into an array called arr.
//        Print out the first three letter of each element of arr, one per line.
    //        You can assume that every element of arr is at least 3 letters long.
package arrays;

import java.util.Scanner;

public class ThreeFirstCharecters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[1];//String [] arr = {banana}

            for (int i = 0; i < 1; i++) {
                System.out.println("Please enter word");

                arr[i] = input.nextLine();
                if (arr[i].length() >= 5) {
                    System.out.println(arr[i].substring(0, 3));

                } else {
                    break;
                }
            }

        }
    }
