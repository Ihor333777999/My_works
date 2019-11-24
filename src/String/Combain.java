//Creating an email.
//        Ask user to enter two strings.
//        Both of these strings should be at least 6 character long.
//        If they are shorter than that print “Invalid data” and program should end.
//        If the information provided is valid, you will take the first 4 characters
//        of first string and combine them with the last three characters of the second string.
//        At the end of your combined string add “@cybertek.com” and print the final string as your created email.
//        > input: “JamesBond”,  Secret> output: jameret@cybertek.com
package String;

import java.util.Scanner;

public class Combain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text");
        String first  = input.nextLine();
        System.out.println("Enter second text");
        String second = input.nextLine();

        String email = "";

        if (first.length()>=6 && second.length()>=6){
           email = first.substring(0,4);
           email += second.substring(second.length()-3);
           email += "@cybertek.com";
            System.out.println(email);

        }else {
            System.out.println("Invalid data");
        }


    }
}
