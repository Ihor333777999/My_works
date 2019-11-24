package homeWorks;

import java.util.Scanner;

public class fffff {
    public static void main(String[] args) {

//
//      Scanner input=new Scanner(System.in);
//        System.out.println("Enter word:");
//        String str1 = input.next();
//
//        //your code here
//        //----------------------------------------------------------
//        int num = str1.length();
//        String str2 = "";
//        if (str1.length() < 3 || str1.length() >= 100) {
//            System.out.println("Invalid enter");
//        } else {
//            for (int i = 0; i < num; i++) {
//                if (str1.charAt(i) >= 48 && str1.charAt(i) <= 57 && str1.length() >= 3 && str1.length() <= 100) {
//                    str2 = str2 + str1.charAt(i);
//                }
//
//            }
//
//            System.out.print(str2);

//        }
Scanner input=new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;


        String answer= "";
        do {
            System.out.println("Enter the number:");
            int number = input.nextInt();
            if (number < 0) {
                negative++;
            } else if (number == 0) {
                zero++;
            } else {
                positive++;}
            input.nextLine();
            System.out.println("Do you want to continue y/n?");
            answer = input.nextLine();
        }
        while (answer.equals("y"));
         if (answer.contains("no")) {

             System.out.println("Positive numbers:" + positive);
             System.out.println("Negative numbers:" + negative);
             System.out.println("Zero numbers:" + zero);
         }else{
             System.out.println("invalid");
         }







    }
    }

