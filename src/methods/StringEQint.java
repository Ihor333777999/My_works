//Create a method that accepts String and int.
//        Check if string length is same as given integer.
//        Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.
package methods;

import java.util.Scanner;

public class StringEQint {
    public static void main(String[] args) {
       equl("name",4);
    }
    public static void equl (String first,int second){
        if (first.length()==second){
            System.out.println("Equls");
        }else {
            System.out.println("no equles");
        }

    }
}
