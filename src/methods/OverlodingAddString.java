package methods;

import java.util.Arrays;

public class OverlodingAddString {
    public static void main(String[] args) {
        String [] arr = {"a","e","i","o"};
    }
    public static void plus (String [] arr, String word){
String  [] newArr =Arrays.copyOf(arr ,arr.length+1);
newArr[newArr.length-3]= word;

    }
}
