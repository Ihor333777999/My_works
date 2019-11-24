package methods;

import java.util.Scanner;

public class calculatorREPl {
    public static void main(String[] args) {
calc("-" ,4 ,  2  );

    }
    public static  void  calc (String opera,int a ,int b){
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("enter operation ");
        opera = input.nextLine();
        System.out.println("enter first number :  ");
        int num1 = input.nextInt();
        System.out.println("enter second number : ");
        int num2 = input.nextInt();


        if (opera.contains("/")){
            result= num1/num2;
            System.out.println(result);
        }else if(opera.contains("*")){
            result= num1*num2;
            System.out.println(result);
        }else  if(opera.contains("+")){
            result= num1+num2;
            System.out.println(result);
        }else if(opera.contains("-")){
            result= num1+num2;
            System.out.println(result);
        }else {
            System.out.println("invalid data");
        }

    }

}
