package homeWorks;

import java.util.Scanner;

public class ifConteint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
String lower = n.toLowerCase();


        if (n.contains("a") || n.contains("A")) {
            System.out.println("Vowel");
        }
        else if (n.contains("e") || n.contains("E")){
                System.out.println("Vowel");
            }
            else if (n.contains("i") || n.contains("I")){
                System.out.println("Vowel");
            }
            else if (n.contains("o") || n.contains("O")){
                System.out.println("Vowel");
            }
             else  if (n.contains("u") || n.contains("U")){
                System.out.println("Vowel");
            }
        else{
            System.out.println("Not Vowel");
        }

    }
}
