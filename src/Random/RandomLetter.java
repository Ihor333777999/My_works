//program generate a random uppercase letter.Print the letter

package Random;

import java.util.Random;

public class RandomLetter {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(26);
        number += 65;

        char letter = (char)(number);
        System.out.println("My namber is " +number);
        System.out.println("Your letter is " +letter);

        }
    }
