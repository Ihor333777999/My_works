package ArrayList;

import java.util.ArrayList;

public class Speaker {
    public static void main(String[] args) {
      /*  ArrayList<String> names = new ArrayList<>();
        names.add("Ihor");
        names.add("Adam ");
        names.add(1,"John");
        System.out.println(names);
        System.out.println(names.get(1));
        System.out.println(names.remove(2));
        System.out.println(names);*/

//how to use list for any objects.
        ArrayList<Cat>catsForeSale = new ArrayList<>();
        Cat cat1 = new Cat();
        cat1.color="white";
        cat1.age=3;

        catsForeSale.add(cat1);

        Cat cat2 = new Cat();
        cat2.color="black";
        cat2.age=10;

        catsForeSale.add(cat2);

        //System.out.println(catsForeSale.size());
        catsForeSale.get(1);
        int count=1;
        for (int i =0 ;i <catsForeSale.size();i++){
            System.out.println("Cat# "+count++);
            System.out.println("color "+ catsForeSale.get(i).color);
            System.out.println("color "+ catsForeSale.get(i).age);
            System.out.println();
        }


    }
}
