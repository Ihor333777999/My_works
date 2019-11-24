//Given you have a library of 5 books.
//        Write a program that will ask user to enter the name of one of the books.
//        If the book is in the library, ask the user what book they replace the original book with.
//        If the book the user enters is not in the library, print “library not changed”. In both cases print out the library for the user to see.
        package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerChangeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of book ");
        String [] book ={"last","first","second"};
        Arrays.sort(book);
        String user = input.nextLine();
        System.out.println(Arrays.toString(book));
int index = Arrays.binarySearch(book,user);

        if (index >=0){
            String newbook = input.nextLine();

            book[index]= newbook;
            System.out.println(Arrays.toString(book));
            System.out.println("good");
        }else{
            System.out.println("it is not in your libery ");
        }
    }

}
