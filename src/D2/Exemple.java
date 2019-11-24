package D2;

import java.util.Arrays;

public class Exemple {
    public static void main(String[] args) {
        int[][] groups = new int[3][3];
        int[] num = {1, 2, 3};
        groups[0] = num;
        System.out.println(Arrays.deepToString(groups));
        /*When we decalre 2D array,the inner arreys - - size do not need to be given .This means innr arreys can have different number
        index for initailazing: int [] [] numbers = { {1,2,3} , {4,5,6} , {7,8,9} }
        Numbers is holding 3 int arreys ech with 3 elements*/

        int [] [] numbers = { {1,2,3} , {4,5,6} , {7,8,9} };
        System.out.println(Arrays.toString(numbers[2])); //res will be "4,5,6"
        System.out.println(numbers[0] [0]);// res will be " 1 "
        System.out.println(numbers[1].length); // res "3" conteins 3 elements
        System.out.println("for tradition");
                                /* for tradition*/
        for (int i =0 ; i <numbers.length;i++){
            for (int j =0 ; j < numbers[i].length;j++){
                System.out.println(numbers[i] [j]);
            }
            System.out.println();
        }


        System.out.println("for each");
                                      /*for each*/
        int [] [] number = { {1,2,3} , {4,5,6} , {7,8,9} };
        for (int [] inner : number){
            for(int element : inner){
                System.out.println(element);
            }
            System.out.println();
        }
    }
}
