package homeWorks;

import java.util.Scanner;

public class Alfabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();


        boolean uppercase = str.charAt(0) >= 65 && str.charAt(0) <= 90;
        boolean lowercase = str.charAt(0) >= 97 && str.charAt(0) <= 122;
        boolean vowels = str.equals("a") || str.equals("e") || str.equals("i")
                ||str.equals("o") || str.equals("u");

        if (str.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }


        }
    }



        //char letter = input.nextLine().toUpperCase().trim().charAt(0);

//            if (letter>65 && letter<90){
//
//
//                    System.out.println("Input letter is Consonant");
//            }
//
//        else {
//            System.out.println("ERROR. It should be exactly 1 character length!");
//        }


