package homeWorks;

import java.util.Scanner;

public class googleDecimalToBinary {


    public static void main(String[] args)
    {

        int decimal;
        int count = 0;
                int res;
        String binary = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        decimal = input.nextInt();
        while(decimal > 0)
        {
            res = decimal % 2;
            if(res == 1)
            {
                count++;
            }
            binary = res + "" + binary;
            decimal = decimal / 2;
        }
        System.out.println("Binary number:"+ binary);
        System.out.println("No. of 1s:"+count);
    }
}
