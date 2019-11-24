//User is asked to enter a sentence. Display the sentence with the first word moved to the end of the sentence.
//        > input: “Java is a fun language”
//        > output: “is a fun language Java”

package String;

import java.util.Scanner;

public class CapName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence ");
        String sentence = input.nextLine();
        int space = sentence.indexOf(" ");
        String firstWord = sentence.substring(0,space);
        String remin = sentence.substring(space +1);
        System.out.println(remin + " "+firstWord);


    }
}
///////................perha bukva z velukoi a rehta z maloi................................

//    Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name");
//                String name = input.nextLine();

//                String firstLetter = name.substring(0,1);
//                firstLetter = firstLetter.toUpperCase();
//                String restOfTheWord = name.substring(1).toLowerCase();
//                System.out.println(firstLetter+restOfTheWord);
