package classes;

public class Item {
    String name;
    double price;
    int size;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
//overload the constructor that takes 3 parameters to set all 3 instance variables
    public Item (String name,double price,int size){
      //  this(name,price,size);  we can do like this
        this.name=name;
        this.price =price;
        this.size=size;       //we chain it
    }
    /*we can call constructor inside another constractor.
    * it is called constructor chaining.
    * we can do it using keyword 'this'with the paarmethesis*/
    public void info() {
        System.out.println("Name " + this.name);
        System.out.println("Price " + this.price + " $");

        System.out.println();
    }
}