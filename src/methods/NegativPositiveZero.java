package methods;

import java.util.Arrays;
import java.util.Scanner;

public class NegativPositiveZero {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];


        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);

    }

    // Create a method here and call it "plus_minus"
public static void plus_minus(int[]arr){

int countN = 0;
int countP= 0;
int countZ= 0;
for (int j =0;j<=arr.length;j++){


    if (arr[j]<0){
        countN++;

    }else if(arr[j]>0){
        countP++;

    }else if(arr[j]==0){
        countZ++;

    }
break;
}

    System.out.println(countN );
}


}

