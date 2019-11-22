package classes;

import java.util.Scanner;

public class HouseTesting {
    public static void main(String[] args) {
        House House1 = new House();
        Scanner input = new Scanner(System.in);
        System.out.println("What type of building");
        House1.type = input.nextLine();

        System.out.println("What the address");
        House1.address = input.nextLine();

        System.out.println("Haw many rooms");
       House1.numRum = input.nextInt();

 House1.info();
    }
}
