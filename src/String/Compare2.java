//User takes two strings from the user. Compare the Strings and print out the String that comes first lexicographically.
package String;

import java.util.Scanner;

public class Compare2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("print too worlds");
        String first = input.nextLine();
        System.out.println("second world");
        String second = input.nextLine();

        int compare = first.compareTo(second);

        if (compare <0){
            System.out.println(first);
        }else if (compare>0) {
            System.out.println(second);
        }else {
            System.out.println("Equal");
        }
    }
}
