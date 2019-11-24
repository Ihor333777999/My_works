package arrays;

import java.util.Scanner;

public class ItchOser55 {
    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

                //TODO Type your code below:

                int [] arr = new  int [5];


                if (nums[0] == 5 && nums[1] == 5 || nums[1] == 5 && nums[2] == 5 || nums[2] == 5 && nums[3] == 5 || nums[3] == 5 && nums[4] == 5 ){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }
        }
