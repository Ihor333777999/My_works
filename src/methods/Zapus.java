
package methods;

import java.util.Arrays;

public class  Zapus {
    public static void main(String[] args) {
        int[]arr={3,4,5,6,7,8};
       arraysToString(arr);

    }
    public static void arraysToString(int [] arr) {

        String result = "[";
        for(int num : arr) {
            result += num + ", ";
        }
        result = result.substring(0,result.length()-2) + "]";
        System.out.println(result);
    }
}
