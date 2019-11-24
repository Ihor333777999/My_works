//Write a method that accepts an int array. Print out the array using the same format as Arrays.toString method. DO NOT USE THE toString() METHOD.
//        [element, element, element]
package methods;

import java.util.Arrays;

public class replaseNegativNumber {
    public static void main(String[] args) {
        int [] num ={67,-987,87};
        replaseNegativ(num,100);
    }
    public static void replaseNegativ (int[] num,int change){
        for (int i=0;i<num.length;i++){
            if (num[i] < 0){
                num[i]= change;



            }
        }
        System.out.print(Arrays.toString(num));
    }
}
