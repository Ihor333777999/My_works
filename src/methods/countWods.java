//Create a void method name countWords that will accept a String as an argument. Print the following:
//        “The number of words in the sentence is: numberOfWords”
package methods;

import java.util.Scanner;

public class countWods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String argument = input.nextLine();
        count(argument);

    }
    public  static void count (String argument){
        String [] count =argument.trim().split(" ");
        System.out.println("the number of words is " + count.length);
        }



    }
