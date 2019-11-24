//) Write a program for the login to application.
//        Program should ask for the password until user hits right password.
//        password is "secret478". If user enters right password print "Welcome to your profile!" and exits the infinite loop.
//        Flow:
//        Please enter your password:
//        > james
//        Please enter your password:
//        > adam
//        Please enter your password:
//        > secret478
//        Welcome to your profile!
//Modify the above task:
//        Give 3 attempts to login.
//        If user fails to enter right password within 3 attempts print "Sorry. You account is locked. Try after 5 hours" and end the program.
package loops;

import java.util.Scanner;

public class passsword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


   //    for (;;){                                                            //part2
        for(int i = 0 ; i <3;i++){                       //for (int attemps = 0; ;attempse ++ ){
                                                             // if (attemps == 3){
                                                             // Sout ();
                                                             // breake;
            System.out.println("Enter yore password ");
            String pass = input.nextLine();
            if (pass.contains("secret478")) {
                System.out.println("Welcome to profile");
                break;
            }

            }
        System.out.println("End sorry try after 5 hours");         //part2
            }
        }



