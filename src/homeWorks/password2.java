package homeWorks;

import java.util.Scanner;

public class password2 {
    public static void main(String[] args) {

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine()
                // Your code here
                //------------------------------------------------
                ;
        int upperCase=0;
        int lowerCase=0;
        int specialChar=0;
        int numbers=0;
        char letter=0;
        if(word.length()>=8) {
            for ( int i=0; i<word.length();i++){
                letter=word.charAt(i);
                if(letter>=65 && letter<=90){
                    upperCase++;
                }else if(letter>=97&&letter<=122){
                    lowerCase++;
                }else if(letter>=48&&letter<=57){
                    numbers++;
                }else if (letter<=32||letter>=47||letter<=58||letter>=64||letter<=91||letter>=96||letter<=123||letter>=126){
                    specialChar++;
                }
            }
            if (upperCase==0){
                System.out.println(" Password should contain at least 1 uppercase number");
            }else if(lowerCase==0){
                System.out.println("Password should contain at least 1 lowercase number");
            }else if(numbers==0){
                System.out.println("Password should contain at least 1 digit ");
            }else if(specialChar==0){
                System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,. \n ");
            }else{
                System.out.println("Your password is accepted");
            }
        }else{
            System.out.println("Password should contain minimum 8 characters");
        }
    }
}


