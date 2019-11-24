//User is asked to enter their name. You will check if it is a cool name.
//        >If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”>
//        Otherwise print “Sorry not a cool name”
package String;

import java.util.Scanner;

public class Beginese {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter youre name");
        String name = input.nextLine();
        String up = name.toLowerCase();

        if (name.startsWith("A") || name.startsWith("Z")){
            System.out.println("cool name");
        }
        else {
            System.out.println("Sorry not a cool name");
        }
    }
}
