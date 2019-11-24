//Create a method that will accept two Strings. Return a new String that has the firstWord then the secondWord and then the firstWord again
//        > input: “day”, “name”
//        > output: “daynameday”


//        Overload the method above to now accept the two Strings and an integer.
//        The integer given tells you how many times your first word should show up in your new String. Your first words need to always be separated by the second word.
//        > input: “day”, “name”, 3
//        > output: “daynamedaynameday”
package methods;

import java.util.Scanner;

//public class OverloadingStrigInteger {
//    public static void main(String[] args) {
//        System.out.println(word("day","night"));
//       // System.out.println(word());
//    }
//    public  static String word (String firstWord ,String secondWord ){
//        String result =firstWord+secondWord+firstWord;
//        System.out.println(""+result);
//        return result;
//    }
//public static String word (int time,String firstWord,String secondWord){
//    Scanner input =new Scanner (System.in);
//    System.out.println("hoe many times you wont to input");
//    time = input.nextInt();
//    System.out.println("input first word");
//    firstWord =input.nextLine();
//    System.out.println("input second Word");
//    secondWord =input.nextLine();
//String word ="";
//    if (time==0){
//        return  "";
//    }
//for(int i=0;i<time;i++){
//
//}
//
//}
////}
//public static void main(String[] args) {
//        //    System.out.println(giveWords("day","night"));
//        System.out.println(giveWords("day", "night", -3));
//        }
//public static String giveWords(String first, String second) {
//        return first+second+first;
//        }
//public static String giveWords(String first, String second, int times) {
//// Only need this condition with substring
////        if(times <= 0) {
////            return "";
////        }
//        String word = "";
//        for(int i = 0; i < times; i++) {
//        word += first;
//        if(i == times -1) {
//        break;
//        }
//        word += second;
//        }
//        return word;
//        //  return word.substring(0,word.length() - second.length());
//        }