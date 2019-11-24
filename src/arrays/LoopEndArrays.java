package arrays;

import java.util.Arrays;

public class LoopEndArrays {
    public static void main(String[] args) {

    String [] names = new String[3];
        System.out.println(Arrays.toString(names));
    names[0] = "james";
    names [1]= "jone";
    names[2] = "dodik";
    for (int i = 0 ;i < names.length;i++){
        System.out.println("name "+ (i+1)+" is " + names[1]);
        //System.out.println("name"+ (i+1)+" is" + names[1].charAt(0));
    }
}
}