package homeWorks;

import java.util.Scanner;

public class bannana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String str2 = input.nextLine();

        if (str2.length()<=3 && str2.length()>=100){
            str2.toLowerCase();
if (str2.equals(1)){

    System.out.println();
}
        }else{
            System.out.println("invalid enter");
        }
    }
}
