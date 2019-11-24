package homeWorks;

import java.util.Scanner;

public class ScanerLenght {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = s.nextLine();
        System.out.println(name.length());
    }
}
