package loops;

public class UtopianTree {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10; i++) {

            if (i <= 3) {                              //i==1;i==2;i==3;first 3 yer
                count++;                                //+1 count =count +1
                System.out.println("year " + i);
                System.out.println("Tree size: "+ count );
            } else if  (i >= 4 && i <=10){
               count = count+2;
                System.out.println("year" + i);
                System.out.println("Tree size: "+ count);

                }


            }
        }
    }
