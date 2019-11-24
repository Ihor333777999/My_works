package loops;

import java.util.Scanner;

public class reverceNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
boolean numbers = num.charAt(0)>=48 && num.charAt(0)<=57;
        String revers = "";
        if(numbers   ){

        for (int i= num.length()-1 ; i >= 0; i--){
            revers +=num.charAt(i);

        }
        }
        System.out.println(revers);

    }
}
