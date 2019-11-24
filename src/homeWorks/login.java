//Credentials: Given two existing data: user and pass of “test” and “test123”
//        Write a program that asks users to enter a username and password.
//        —> If the username and password match print: “ Welcome!”
//        —> If username is incorrect print: “invalid username” and don’t ask for the password
//        —> If password is incorrect print: “invalid password”
package homeWorks;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name : ");
        String user = input.nextLine();

        System.out.println("Enter your password : ");
        String pass = input.nextLine();


        if (user.contentEquals("test") && pass.contentEquals("test123")) {
            System.out.println("Welcome");
        }
        if (!user.equals("test") && !pass.equals("test123")) {
            System.out.println("Invalid user name ");
            System.out.println("Invalid password ");
        } else if (!user.equals("test")) {
            System.out.println("invalid user name");
        } else if (!pass.equals("test123")) {
            System.out.println("invalid password");
        }
    }
}
//        Scanner input = new Scanner(System.in);
////        int age = input.nextInt();
////        input.nextLine();
//        String validUser = "test";
//        String validPass = "test123";
//        System.out.println("Enter your username");
//        String loginUser = input.nextLine();
//        if(loginUser.equals(validUser)) {
//            System.out.println("Enter your password");
//            String loginPass = input.nextLine();
//            if(loginPass.equals(validPass)) {
//                System.out.println("Welcome");
//            } else {
//                System.out.println("Invalid password");
//            }
//        } else {
//            System.out.println("Invalid username");
//        }
//    }
//}
//
//
//    }
//}

//