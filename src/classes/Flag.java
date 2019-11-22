package classes;

public class Flag {
    String country;
    int size;
    String color;
    String material;

    public  void info(){
        System.out.println("Country: "+ country);
        System.out.println("Size : "+size);
        System.out.println("Color : "+color);
        System.out.println("Material : "+material);

    }

    public void flap(){
        System.out.println("flag is flapping");

    }
    // Create a method called upgrade.
    //method should accept int for size and String for material.
    //method upgrade should reassign the current
    //size and material with given new values.

    public  void upgrade( int size, String material){  //parameter when they passed name argument
       this.size = size;  //this above toy sho zhoru
       this.material=material;


    }
}
