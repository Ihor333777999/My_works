package classes;

public class FlagTesting {
    public static void main(String[] args) {

        Flag f1 = new Flag();

        f1.color="blue and yellow";
        f1.country="UA";
        f1.material="cotton";
        f1.size= 3;
       // System.out.println(f1.country);

Flag f2 = new Flag();
f2.color="red";
f2.country="Canada";
        //System.out.println(f2.country);

        f1.info();
        System.out.println();
        f2.info();


    }
}
