package homeWorks;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        char str = txt.charAt(5);
        char str1 = txt.charAt(6);
        char str2 = txt.charAt(7);
        System.out.print(""+ str + str1 + str2);
    }
}
