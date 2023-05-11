package Class;

public class BankAccountMain {
    public static void main (String[] args) {
        BankAccount account = new BankAccount("Lee Vue", 500);
        double MyDeposit = account.deposit(100);
        account.accountInfo();

        BankAccount Larry = new BankAccount("Larry", 5000);
        double LarryAccount = Larry.withdrawal(100);

        BankAccount Mary = new BankAccount("Mary", 300);
        double MaryAccount = Mary.deposit(100);

        System.out.println("Larry's account balance: " + LarryAccount);
        System.out.println("Marry's account balance: " + MaryAccount);
    }

}
