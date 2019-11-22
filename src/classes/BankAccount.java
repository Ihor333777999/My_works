package classes;

public class BankAccount {
    String type;
    int accountNumber;
    double balance;
    String holderName;

    public void deposit(double amount) {

        System.out.println(amount + " is deposited to your account");
         this.balance+=amount;
    }

    public void transfer(double amount) {
        if(this.balance>=amount){
        System.out.println( amount+ " $ is transfer to your account");
        balance-= amount;
        }
        else{
            System.out.println("don't have a money");
        }
    }

    public void info() {
        System.out.println("balance : " + this.balance+"$");
        System.out.println("holder Name : " +this. holderName);
        System.out.println("type: " + type);
        System.out.println("account number : " +this. accountNumber);

    }
}