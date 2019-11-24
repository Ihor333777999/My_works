package homeWorks;

import java.util.Scanner;

public class DolarMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price=0;
        int quarter=0;
        int dime = 0;
        int nickle=0;

        System.out.println("Enter price in cents:");
        price = input.nextInt();
        int money = 0;
if (price >=0 && price <=100 ) {

    money =100 -price;
     quarter = money / 25;
    price %= quarter;

    dime = money / 10;
    price %= dime;

   nickle = money / 5;
    price %= nickle;
    System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, and "+nickle+" nickels.");
}else{
    System.out.println("invalid");
}





    }
}
