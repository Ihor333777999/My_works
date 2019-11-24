//Given an String, n , perform the following conditional actions:
//        If  n contains a and length less than 5, print A Perfect,
//        If n contains b, a and length between 7 and 10 (both inclusive) print B Perfect, if not between range and not included a then print Perfect, if a included and not between the range, print empty (System.out.println("");
//        If none of them the print Sorry
//        package homeWorks;

import java.util.Scanner;

public class notContein {
    public static void main(String[] args) {

        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
       if (n.contains("a") && n.length()<5){
           System.out.println(" A Perfect");
       } else if   (n.contains("a") && n.contains("b") && n.length()>=7 && n.length()<=10){ ;
            System.out.println("B Perfect");
        }else{
            if(!n.contains("a")){
                System.out.println("Perfect");
            }else {
                if(n.contains("a")){
                    System.out.println("");
                }else{
                    System.out.println("Sorry");
                }

            }

       }



    }
}






//
//if (n.contains("a") && n.length()<=5){
//    System.out.println(" A Perfect");
//}
//if (n.contains("b") && n.contains("a") && n.length()>=7 && n.length()<=10){
//    System.out.println("B Perfect");
//}
//if ( !n.contains("a") && n.length()>1 && n.length()<100) {
//    System.out.println("Perfect");
//}
//if (n.contains("a") && n.length()>1 && n.length()<100){
//    System.out.println("");
//}
//if (!n.contains("a") && !n.contains("b") && n.)  {
//    System.out.println("Sorry");
//}