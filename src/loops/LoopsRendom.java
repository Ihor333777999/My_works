//Generate a random number that is six digits long.
//        Each digit in this number should be unique,
//        meaning the number 6 digit number should have 6 different character numbers that make it up.
//        Print the number.
        package loops;

import java.util.Random;

public class LoopsRendom {
    public static void main(String[] args) {
        Random random = new Random();

        String number = "";  //125
        for(int i=0; i < 6; i++) {
            int ranNum = random.nextInt(10);
//            if(number.contains(ranNum+ "")) {
//                ranNum = random.nextInt(10);
//            }

            while(number.contains(ranNum + "")) {
                ranNum = random.nextInt(10);
            }
            number += ranNum;
        }
        System.out.println(number);
    }
    }

