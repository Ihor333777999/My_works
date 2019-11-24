package homeWorks;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String str = "";
        for(int i=0; i < word.length(); i++) {
            if(!str.contains(word.charAt(i) + "")) {
                str += word.charAt(i) + "";
            }
        }
        System.out.println(str);
    }
//}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // your code
//        //---------------------------------------
//        String word=scanner.nextLine();
//        String uniq = "";
//        String character="";
//        for(int i=0;i<word.length(); i++){
//            character=word.charAt(i)+""; //
//            if(!uniq.contains(character)){
//                uniq+=character;
//            }
//
//        }
//        System.out.println(uniq);
//
//



    }

