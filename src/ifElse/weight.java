package ifElse;

import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        BMI: Program will ask user to enter their mass (pounds) and their height (feet). Calculate their BMI and then print the appropriate message based on the provided values:
//—> BMI Formula: BMI = mass / height^2
//—> Values:
//        Less than 18.5 — Underweight
//        From 18.5 to 25 — Normal weight
//        From 25 to 30 — Overweight
//        More than or equal to 30 — Obese

        System.out.println("Enter your mass(pounds) :");
        double mass = input.nextDouble();
        System.out.println("Enter yuor height (feet) :");
       double height = input.nextDouble();
       double formula  = mass / (height*height);
       if ( formula < 18.5) {
           System.out.println(" Under weight");
       }
            else  if (formula >= 18.5 && formula <25){
                System.out.println("Normal weight");
            }
           else if (formula >=25 && formula < 30){
                System.out.println("Overweight");
            }
            else if (formula >=30){
                System.out.println("Obese");
            }


    }
}
//        System.out.println("Enter your mass in kilogram");
//        double mass = input.nextDouble();
//        System.out.println("Enter your height in meters");
//        double height = input.nextDouble();
//        double bmi = mass / (height * height);
//        if(bmi < 18.5) {
//            System.out.println("Underweight");
//        } else if(bmi >= 18.5 && bmi < 25) {
//            System.out.println("Normal weight");
//        } else if(bmi >= 25 && bmi < 30) {
//            System.out.println("Overweight");
//        } else {
//            System.out.println("Obese");
//        }
//    }
//}
