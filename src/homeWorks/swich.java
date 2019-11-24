package homeWorks;

import java.util.Scanner;

public class swich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter:");
        int status = input.nextInt();

        // your code here
        //--------------------------------------
        switch (status){
        case 200 :
        System.out.println("OK (fulfilled)");
        break;
        case 403 :
        System.out.println("forbidden");
        break;
        case 404 :
        System.out.println("not found");
        break;
        case 500 :
        System.out.println("server error");
        break;


    }
}
    }
