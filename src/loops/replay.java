package loops;

import java.util.Scanner;

public class replay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        for (int i = 0; i < 4;i++){
            System.out.println("Enter yore name " +(i + 1));
            String name = input.nextLine();
            System.out.println(name);
        }
    }
}
