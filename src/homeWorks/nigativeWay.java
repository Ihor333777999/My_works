//
//package homeWorks;Given a String, str2 , (str2 may contain characters, numbers and special characters) perform the following conditional actions:
//        Check if str2 has 3 or more characters, if less than 3 or bigger than 100 character, print only Invalid enter
//        Get only numbers from str2 and make one string then print (Hint: use charAt(), ASCII table to verify specific character is number or not number)
//
//        Input: av$5yit8
//        Output: 58

import java.util.Scanner;

public class nigativeWay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zero=0;

        String answer = " ";
        do {
            System.out.println("Enter number:");
            int number = input.nextInt();
            negative =number;
            System.out.println("Do you want to enter new guest name:");
            answer = input.nextLine();

        }
        while (answer.equals("yes"));
        if (answer.equals("no")){
            System.out.println("negativ: " + negative);
        }else {
            System.out.println("invalid");
        }

        }}