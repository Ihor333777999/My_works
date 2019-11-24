package homeWorks;

import java.util.Scanner;

public class middle {
    public static void main(String[] args) {

            System.out.println("Please enter word:");
            Scanner scanner = new Scanner(System.in);
            String n1 = scanner.nextLine();
int position;
int length;


            if (n1.length()%2==1 && n1.length()>5){
                position = n1.length()/2;

                length=1;
            }else {
                position=n1.length()-1;
                length=2;
            }
            String result =n1.substring(position,position +length);
        System.out.println("middle: "+result);


        }}

