package arrays;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {

//
               Scanner input = new Scanner(System.in);
                String email = input.nextLine();
//String z="@";
      //  String[] str = email.split(z);
//                //Write your code below
//                if (email.contains("@")|| email.length()==2) {
//
//
//
//                    System.out.println("Email id: "+str[0]);
//
//                    System.out.println("Email domin "+str[1]);
//
//
//                }else {
//                    System.out.println("Invalid date");
//
//                }
        String[] arr = email.split("@");
        if(arr.length==2){
            System.out.println("Email id: "+arr[0]);
            System.out.println("Email domain: "+arr[1]);
        }else{
            System.out.println("invalid email");
        }





    }
        }

