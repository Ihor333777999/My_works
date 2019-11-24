package ScannerAndIncrement;

public class increment {
    public static void main(String[] args) {
        int age =5;
//        age +=6;          //same
//        age = age + 6;    //same short hand
//
//        age+=1;
//        age++;            //increnent +1 add
//
//        age ++;           //post increment
//        ++age;           //

                               //INCREMENT ++

        int x = 11;
        int y = x++;                   //int y = 11 then x increments
        System.out.println("x="+x);  //x = 12
        System.out.println("y="+y);  //y=11

        System.out.println(age);     // 5
        System.out.println(++age);   //6
        System.out.println(age++);  //6 after complein 7
        System.out.println(age);    //7

                        //DECREAMENT --
    }
}
