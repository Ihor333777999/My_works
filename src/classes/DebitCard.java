package classes;

public class DebitCard {
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    public void  info(){
        System.out.println("holder name is "+this.holderName);
        System.out.println("card type "+this.cardType);
        System.out.println("card number "+this.cardNumber);
        System.out.println("balance "+this.balance);

    }
    public DebitCard(int cardNumber,String holderName,double balance) {
        this.holderName=holderName;
        this.balance=balance;
       String cardN = Integer.toString(cardNumber);
        if (cardN.length()==5){
            System.out.println("Valid number");
            this.cardNumber=cardNumber;
        }else{
            System.out.println("Invalid card number");
        }

    }
    public DebitCard(int cardNumber,String holderName,double balance,int pin,String cardType){
        this(cardNumber,holderName,balance);
        if(cardType.contains("MasterCard") ||cardType.contains("visa")){
            System.out.println("valid card type");
            this.cardType=cardType;
        }else{
            System.out.println("invalid");
        }
        String pin1= Integer.toString(pin);
        if (pin1.length()==4){
            this.pin=pin;
        }else{
            System.out.println("invalid pin");
        }
    }
}
/*
package classes;
public class DebitCard {
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;
    public DebitCard(long cardNumber, String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
        if(String.valueOf(cardNumber).length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid card number");
        }
    }
    public DebitCard(long cardNumber, String holderName, double balance, int pin, String cardType) {
        this(cardNumber,holderName,balance);
        if(String.valueOf(pin).length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin");
        }
        if(cardType.equalsIgnoreCase("mastercard") || cardType.equalsIgnoreCase("visa")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type");
        }
    }
    public void info() {
        System.out.println("Holder name " + holderName);
        System.out.println("Card Number " + cardNumber);
        System.out.println("Balance " + balance);
        if(cardType != null) {
            System.out.println("Card type is " + cardType);
        }
    }
}
 */