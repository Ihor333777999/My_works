package homeWorks;

import java.util.Scanner;

public class paty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "";
        String answer = " ";
        do {
            System.out.println("Enter  name");
            String name = input.nextLine();
            list += name + ", ";
            System.out.println("Would you like to enter a new guest");
            answer = input.nextLine();
        }
        while (answer.equals("yes"));
        if (answer.equals("no")){
            System.out.println("Guest list:" + list.substring(0, list.length() - 2));
        }else {
            System.out.println("invalid");
        }


    }

}

