package homeWorks;

import java.util.Scanner;

public class WithOutNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        int num = str1.length();
        String str2 = "";
        if (str1.length() < 3 || str1.length() >= 100) {
            System.out.println("Invalid");
        } else {
            for (int i = 0; i < num; i++) {
                if (str1.charAt(i) >= 48 && str1.charAt(i) <= 57 && str1.length() >= 3 && str1.length() <= 100) {
                    str2 = str2 + str1.charAt(i);
                }
            }
            System.out.print(str2);
        }
    }
}
