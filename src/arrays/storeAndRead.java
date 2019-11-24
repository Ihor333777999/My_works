package arrays;

import java.util.Arrays;

public class storeAndRead {
    public static void main(String[] args) {
//        int [] nums = new int [4];
//        nums [0]=4;
//        nums [1]= 3;
//        System.out.println(nums [1] + 1);
//        System.out.println(Arrays.toString(nums));

      String [] names = new String[3];
        System.out.println(Arrays.toString(names));
        names[0] = "james";
        names [1]= "jone";
        names[2] = "dodik";
        System.out.println(Arrays.toString(names));

        names[1 ] = names [1].substring(0,1).toUpperCase() + names[1].substring(1).toLowerCase();
        System.out.println(names[1]);

    }
}
