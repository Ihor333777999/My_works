package homeWorks;

import java.util.Arrays;

public class SwitchElements {
    public static void main(String[] args) {

    }

    public static int[] do_switch(int[] i) {
        int temp;
        temp = i[0];
        i[0] = i[i.length-1];
       i[i.length-1] = temp;


  return i;
    }

}
