package ArrayList;


import classes.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String name;
    String address;
    ArrayList<Item> items = new ArrayList<>();
    int numberItems;

    public Store (String name,String address){
        this.name=name;
        this.address=address;
    }


    public void addItem(Item item){
this.items.add(item);
this.numberItems ++;

        }
        public void addItem(){
            Scanner input = new Scanner(System.in);
            System.out.println("how many item you wont to add? ");
            int many = input.nextInt();

            for(int i =0;i<many;i++){

                System.out.println("Enter name for item " + (i + 1));
                String name = input.nextLine();
                System.out.println("Enter price for item " + (i + 1));
                double price = input.nextDouble();
                input.nextLine();
Item item = new Item(name,price);
this.items.add(item);
this.numberItems++;
            }


        }


    public void seeInventory(){
        for(Item item: items){
            item.info();
        }

    }
}
