package classes;

public class House {
    String type;
    String address;
    int numRum;

    public  void info() {
        System.out.println("\nType: " +this.type);
        System.out.println("Address : " + this.address);
        System.out.println("rums : " + this.numRum);
    }
}
