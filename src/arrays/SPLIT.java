package arrays;

import java.util.Arrays;

public class SPLIT {
    public static void main(String[] args) {
        clean("igor boss","igor");
        System.out.println(clean("igor boss igor hhh","igor"));


        String str = "Igor good jab";
        String[] regular = str.split(" ");
        char[] chararr = str.toCharArray();
        System.out.println(Arrays.toString(regular));
        System.out.println(Arrays.toString(chararr));

    }
    public static String clean (String text ,String badWord) {
        String res = "";
        if(text.contains(badWord)){

            res = text.replaceAll(badWord, "");

        }
        return res;
}}
