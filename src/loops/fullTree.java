package loops;



public class fullTree {
    public static void main(String[] args) {

        int  i, j, space = 1;
        space = 9 - 1;

        for (j = 1; j <= 9; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    }

