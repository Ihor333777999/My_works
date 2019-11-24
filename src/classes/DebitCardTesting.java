package classes;

public class DebitCardTesting {
    public static void main(String[] args) {
/*
Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance.
 The card number has to be 16 characters long to be a valid card number.
 If the length is too short or too big do not store the card number and print “Invalid card number”
 */
DebitCard card11= new DebitCard(55555,"james",545.54);
card11.info();

    }
}
/*
package classes;
public class DebitTest {
    public static void main(String[] args) {
        DebitCard db1 = new DebitCard(2333333333333333L, "james",30);
        db1.info();
        System.out.println();
        DebitCard db2 = new DebitCard(5333333333333333L, "adam",300, 3632,"vi");
        db2.info();
    }
}
 */