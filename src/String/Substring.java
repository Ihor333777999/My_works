//Ask user to enter a word.
//        If the first or second or both letter of the word is x, print the word without x(s).
//        If x is the third letter it should be printed.
//        If the first and second are x, both should be ignored.

        package String;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        String newWord = "";
//        if(word.startsWith("x") || word.indexOf("x")==1) {
//            newWord = word.substring(2);
//            System.out.println(newWord);
//        }else if(word.indexOf("x") == 2 ){
//            newWord = word;
//            System.out.println(newWord);
//        }else if (word.startsWith("xx")){
//            System.out.println("ignore");
//        }
        if(word.startsWith("xx")) {
            newWord = word.substring(2);
            System.out.println(newWord);
        }else if(word.startsWith("x")){
            newWord = word.substring(1);
            System.out.println(newWord);
        }else if(word.indexOf("x")==1) {
            newWord = word.substring(0,1) + word.substring(2);
            System.out.println(newWord);
        } else {
            System.out.println(word);
        }
    }}
