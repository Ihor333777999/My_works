package SwithStatement;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number from 1 to 9");
        int letter = input.nextInt();

        switch (letter){
            case 1 :
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;

            default:

                System.out.println("invalid number");



        }
    }
}
//public class NumberToWords {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        String word = "";
//        switch (number) {
//            case 1:
//                word = "one";
//                break;
//            case 2:
//                word = "two";
//                break;
//            case 3:
//                word = "three";
//                break;
//            case 4:
//                word = "four";
//                break;
//            case 5:
//                word = "five";
//                break;
//            case 6:
//                word = "six";
//                break;
//            case 7:
//                word = "seven";
//                break;
//            case 8:
//                word = "eight";
//                break;
//            case 9:
//                word = "nine";
//                break;
//            default:
//                word = "Not a valid Number";
//        }
//        System.out.println(word);
//    }
//}