package arrays;

import java.util.Arrays;

public class Aangram {
    public static void main(String[] args) {
//        String word1 ="earth";
//        String word2 ="heart";
//        int count=0;
//        String[] regular1 = word1.split(" ");
//        String[] regular2 = word2.split(" ");
//        for(int i =0;i<regular1.length;i++) {
//
//            if (regular1[i].contains(word2)){
//                System.out.println("true");
//            }else {

                    String str1 = "Recials";
                    String str11=str1.toLowerCase();
                    String str2 = "articles";
                    String str22 =str2.toLowerCase();

                    if (str11.length()==str22.length()) {

                        char[] arr1 = str11.toCharArray();
                        Arrays.sort(arr1);

                        char[] arr2 = str22.toCharArray();
                        Arrays.sort(arr2);

                        System.out.println(Arrays.equals(arr1, arr2));

                    }
                }
}
