//Create String array size of 4;
//        Store 4 names in that array.
//        Give a proper name for your array variable. Make sure to assign value for every single index.
//        Print out second and third names on separate lines.
package arrays;

public class CriateArray {
    public static void main(String[] args) {

        //String [] names = {Igor,Bob,Ben,Vassia}

        String [] names = new String[4];
        names[0] = "Igor";
        names[1] = "Bob";
        names[2] = "Ben";
        names[3] = "Vasia";
        System.out.print(names[2]);
        System.out.println();
        System.out.print(names[0]);
    }
}
