package ifElse;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       String dosmaku ="to taste", ruba = "salmon" , poklastu = "put" , skoworotka = "frying pan" , forma = "form" , pluta = "owen", duhowka="blower", olia="oil", sill="salt", perec="pepper", specii="spices";

        System.out.println("Enter the type of cooking : blower or owen ");
        String vvod = input.nextLine();
        if (vvod.equals("blower")) {
            System.out.println("You selected type : BLOWER");
            System.out.println(poklastu + " "+ruba+" "+forma+" "+dosmaku+" "+sill+" "+perec+" "+specii+ " Keep for 35 minets at temperature 375");
            System.out.println("BON APPETIT)");

        }
       else if (vvod.equals("owen")) {
            System.out.println("You selected type : OWEN");
            System.out.println(poklastu+" "+ruba+" "+skoworotka+" "+olia+" "+dosmaku+" "+sill+" "+perec+" "+specii+" Keep for 5 minutes on each side");
            System.out.println("BON APPETIT)");

        }

    }
}

