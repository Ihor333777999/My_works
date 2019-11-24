package ifElse;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two double values: ");
        double one = input.nextDouble();
        double two = input.nextDouble();
        input.nextLine();
        System.out.println("Chooose operator From below options: +,-,*,/ ");
        String operator = input.nextLine();


        if (operator.equals("*")) {

            System.out.println( "Result of " + one +operator+ two+ "is result " + (one * two));
        }
        else if (operator.equals("+")){
            System.out.println(" Result of"  + one +operator+ two+ "is result " + (one + two));
        }
        else  {
            System.out.println("Invalid operator entered.Please try again!");
        }
    }
}