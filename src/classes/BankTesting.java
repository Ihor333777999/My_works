package classes;

public class BankTesting {
    public static void main(String[] args) {
        BankAccount emploer = new BankAccount();
        emploer.holderName= "Ihor";
        emploer.accountNumber=422444;
        emploer.balance = 4000;
        emploer.type="bisnes";

        emploer.info();
        emploer.deposit(5000);
        emploer.info();
        emploer.transfer(7000);
        emploer.info();

    }
}
