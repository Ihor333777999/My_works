package SwithStatement;

import java.util.Scanner;

public class Swith {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enternum of babies ");
        int numBabies =input.nextInt();

        switch (numBabies){
            case 0:
                System.out.println("sorry");
                break;
            case 1:
                System.out.println("good for you");
                break;
            case 2 :
                System.out.println("wow.Twins");
                break;
            case 3 :
                System.out.println("wow.Triples");
                break;
            case 4 :
            case 5 :
            case 6 :
                System.out.println("Unbeliveable "+ numBabies+" babies");

            default:
                System.out.println("I dont believe you");

        }
    }
}
