package String;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a message");
        String message = input.nextLine();

        if (message.isEmpty()){
            System.out.println("message is empty");

        }
        else if(message.length()>= 10){
            System.out.println("message is good");
        }
        else {
            System.out.println("message is too short");
        }
    }
}
//names has a?
//    scaner
//string name =input...
//if name is empty
//else if lname.contains a
//coool name
//else ok

