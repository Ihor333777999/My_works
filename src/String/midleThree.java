package String;

import java.util.Scanner;

public class midleThree {
    public static void main(String[] args) {

                System.out.println("Please enter word:");
                Scanner scanner = new Scanner(System.in);
                String n1 = scanner.nextLine();
                int count = 0;
                for (int i = 0; i == n1.length(); i++){
count++;
                }

               if (count%2==1 && count>5){

                    String middle =n1.substring(n1.length()/2-1,n1.length()/2+2);
                    System.out.print(middle);
                }else{
                    System.out.println("false");
                }
    }
}
