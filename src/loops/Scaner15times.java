package loops;

import java.util.Scanner;

public class Scaner15times {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Print yore  name ");
        String name = input.nextLine();
         for ( int i = 0 ; i <15;i++){
             System.out.println(name);
         }
        System.out.println("");
         for (int i = 0; i < name.length();i++){
             System.out.println(name.charAt(i) +" for index "  + i);
         }
    }
}
