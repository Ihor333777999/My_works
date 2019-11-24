package arrays;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

   String str="fdd45fd4f5";
        int [] arr = {};
        int numbers = 0;
        int res=0;


        for ( int i=0; i<str.length();i++){
            res=str.charAt(i);
         if(res>=48&&res<=57){
             numbers=res;
             int ascii=numbers;
             char c=(char)ascii;
             System.out.println(c);

             }

           }

       }


    }

//    public static int[] onlyNum(String str) {
//        String num = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
//                num += str.charAt(i);
//            }
//        }
//        String[] arr = num.split("");
//        int[] nums = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            nums[i] = Integer.parseInt(arr[i]);
//        }
//        return nums;
//    }