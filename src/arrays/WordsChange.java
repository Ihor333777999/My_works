//Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

        package arrays;

        import java.util.Scanner;

public class WordsChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] arr = sentence.split(" ");
        String finalWord = "";
        for (int i = arr.length - 1; i >= 0; i--) {
          finalWord = finalWord;
            finalWord=finalWord + arr[i]+ " " ;


           // String  finalWord1 = finalWord.trim();
        }
        System.out.println(finalWord);
    }
}
