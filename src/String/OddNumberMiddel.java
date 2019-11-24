
//Ask user to enter a word. If the word has odd number of characters and has 3 or more characters, print the character in the middle of the word.

package String;

import java.util.Scanner;

public class OddNumberMiddel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yore name: ");
        String name = input.nextLine();

//        if (num % 2 == 0){
//            System.out.println("Entered number is an even number");
//        } else {
//            System.out.println("Entered number is an odd number");
if (name.length()>3 && name.length() % 2 == 0    ){
    int len=name.length();
       int middel =len/2;
       char c[] =name.toCharArray();
       //char ch[]=name.toCharArray();
       System.out.println("Middle Character is: "+middel);

}else {
    System.out.println("invalid word");
}
//        int len=name.length();
//        int c=len/2;
//        char ch[]=name.toCharArray();
//        System.out.println("Middle Character is: "+ch[c]);
    }

        }


