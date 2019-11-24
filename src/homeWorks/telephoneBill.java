package homeWorks;

import java.util.Scanner;

public class telephoneBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCall;
        double bill=0.0;
        System.out.println("Enter number of calls:");
        numberOfCall = input.nextInt();

        // your code here. (DO NOT change existing code)
        //----------------------------------------------

int price= 0;

if(numberOfCall > 0 && numberOfCall <=100  ){
            bill = 200;
        }else if (numberOfCall ==100 ){
    double result =100 * 0.68;
bill = result;
        }else if (numberOfCall>= 100 && numberOfCall<=150){
            double result =( numberOfCall -100 ) * 0.60;
            bill = result +200;
        }else if (numberOfCall ==150 ){
    double result1  =150 * 0.50;
 bill = result1 ;
        }else if (numberOfCall >=150 && numberOfCall<=200 ){
    double result2 = (numberOfCall - 150 )* 0.50;
    bill = result2 +200;
}else if (numberOfCall == 200){
    double result3 = 200 * 0.60;
    bill = result3;
} else if (numberOfCall >=200 ) {
    double result3 = (numberOfCall - 200) * 0.40;
    bill = result3 + 200;
}









        //----------------------------------------------
        System.out.println("Your bill is $"+bill);
    }
}
