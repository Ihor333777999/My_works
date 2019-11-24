package homeWorks;

import java.util.Scanner;

public class AlehandroMails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String read = "read";
        String dont = "dont read";
        if (a.indexOf("alejandro") >=0 ){
            System.out.println(read);
        }else {
            System.out.println(dont);
        }
    }
}
