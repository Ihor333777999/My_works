package Random;

import java.util.Random;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your number ");
        int number = input.nextInt();

         number = random.nextInt( 10);

        if (number >10){
            System.out.println("you guess is to high");
        }
        if (number <0 ){
            System.out.println("you guess is too low");
        }
        if  (number >= 0 && number <=10){
            System.out.println(" Congrats you guessed right");
        }

    }
}
//    Scanner input = new Scanner(System.in);
//    Random random = new Random();
//    int randomNumber = random.nextInt(10);
//        randomNumber++; // this is how I get the range to be 1-10
//                System.out.println("Guess a number ");
//                int guessNumber = input.nextInt();
//                System.out.println("The random number is: " + randomNumber);
//                if(randomNumber == guessNumber) {
//                System.out.println("Good guess");
//                } else if(guessNumber < 1 || guessNumber > 10) {
//        System.out.println("Not a valid guess");
//        } else if(guessNumber > randomNumber) {
//        System.out.println("Too high");
//        } else if (guessNumber < randomNumber){
//        System.out.println("Too Low");
//        }
//        }
//        }