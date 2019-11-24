//Create a method that will accept an int array. Add up all the numbers in your array, except for numbers that end with 5.
//        Overload your method to take an int array and a number.
//        Now return the sum of all the numbers, except for the numbers that end with the given number.import java.util.*;
//class Main {
//  public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    int[] inhabitants = new int[8];
//    for(int i=0; i<inhabitants.length; i++) {
//      inhabitants[i] = input.nextInt();
//    }
//
//    // Take every number from array and divide by 2 and store same index
//
//    //TODO. Write you code below this line.
//
//
//    int day =0;
//    int sumOfppl=0;
//
//    System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
//
//    do{
//      day++;
//      sumOfppl=0;
//
//      for(int i=0; i<inhabitants.length; i++){
//
//          inhabitants[i]= inhabitants[i]/2;
//          sumOfppl+=inhabitants[i];
//
//      }
//
//      System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
//
//    }while(sumOfppl!=0);
//
//    System.out.println("---- EXTINCT ----");
//
//
//
//  }
//}
