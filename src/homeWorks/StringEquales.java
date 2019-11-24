package homeWorks;

import java.util.Scanner;

public class StringEquales {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();


        if (a.equals(b) ){
            System.out.println("a equals b");

        }
        else {
            System.out.println("a dose not equals b");
        }
    }
}
