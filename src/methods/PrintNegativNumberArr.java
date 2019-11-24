package methods;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNegativNumberArr {
    public static void main(String[] args) {

negativ(4,5,67,-45);
    }
    public  static void negativ (int ... num){ //... arr
        for (int neg :num) {
            if (neg < 0) {


                System.out.println(neg);

            }

        }}}