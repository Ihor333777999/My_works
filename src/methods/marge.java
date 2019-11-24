package methods;

import java.util.Scanner;

public class marge {
    public static void main(String[] args) {



    }
    public static int marge (int []a , int [] b){
        Scanner input = new Scanner(System.in);
        int first  = input.nextInt();

        int second = input.nextInt();

        int res = a[first]+ b[second];

     return res;
    }
}
