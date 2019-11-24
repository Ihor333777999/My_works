package homeWorks;

public class loopTree {
    public static void main(String[] args) {

       int grouw = 1;
       int count =0;
        for (int i = 0; i < 10; i++) {
           if (i == 0 && i<=3 ){
               grouw +=grouw;
               System.out.println(grouw);
           }
            System.out.println("Hello" + i);
        }
    }
}
