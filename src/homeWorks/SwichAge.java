package homeWorks;

import java.util.Scanner;

public class SwichAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter:");
        int age = input.nextInt();


        switch (age){
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14:
            case 15: case 16: case 17: case 18:
                if (age <2){
                    System.out.println(" ineligible");
                }else if (age ==2){
                        System.out.println("toddler");
                }else if(age>=3 && age<=5){
                    System.out.println("early childhood");
                }else if(age ==6 || age ==7){
                    System.out.println("young reader");
                }else if(age >=8 && age <=10){
                    System.out.println(" elementary");
                }else if(age == 11 || age ==12){
                    System.out.println("middle");
                }else if(age == 13){
                    System.out.println(" impossible");
                }else if (age >= 14 && age <= 16){
                System.out.println("high school");
            }else if(age ==17 || age == 18){
                    System.out.println("scholar");
                }

            default:
                System.out.println("ineligible");



        }
    }
}
