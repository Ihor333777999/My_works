package ArrayList;

import classes.Item;

public class StoreTesting {
    public static void main(String[] args) {
Store zara = new Store ("Zara","323 main st");
        Item item1= new Item("socks",89);
        Item item2 = new Item("coat",6);
        Item item3 = new Item("T-scirt",34);

        zara.addItem(item1);
        zara.addItem(item2);
        zara.addItem(item3);

        System.out.println(zara.numberItems);
        zara.seeInventory();

    }


}
