package classes;

public class CarTesting {
    public static void main(String[] args) {
        Car Car1 = new Car();
        Car1.make= "Ford";
        Car1.sportEdition = true;
        Car1.mileage = 238;
        Car1.year = 2019;
        System.out.println(Car1.mileage);

        Car1.drive("Ukraine");
        System.out.println(Car1.mileage);
       Car1.drive(800);
        System.out.println(Car1.mileage);
      Car1.drive("Ukraine");
    }
}
