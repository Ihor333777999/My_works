//Ask user to enter a new password.
//        If the password does not match any of the requirements below, print a message based on what requirement it is breaking.
//        If it does not break any requirement,
//        print ‘Password accepted’.
//
//        Password requirements:
//
//        Be a minimum of eight (8) characters in length
//
    //        Contain at least one uppercase letter (A-Z)
//
//        Contain at least one lowercase letter (a-z)
//
//        Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
//
//        Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)
package homeWorks;

import java.util.Scanner;

public class passwordCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        for (int i = 0; i <= password.length(); i++) {
            if (password.length()>=8 && password.charAt(i) >= 65 && password.charAt(i) <= 90){// && password.charAt(i)>=97 && password.charAt(i) <=122 && password.charAt(i) >=48 && password.charAt(i) <=57 && password.charAt(i) >=33&& password.charAt(i) <=66) {
                System.out.println("welcome");






            }


        }
        System.out.println("End sorry try after 5 hours");
    }}