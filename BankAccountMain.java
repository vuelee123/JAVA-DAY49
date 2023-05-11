public class BankAccountMain {
    public static void main (String[] args) {
        BankAccount account = new BankAccount("Lee Vue", 500);
        account.deposit(100);
        account.accountInfo();

        BankAccount Larry = new BankAccount("Larry", 5000);
        Larry.withdrawal(100);
        Larry.AddAccount();

        BankAccount Mary = new BankAccount("Mary", 300);
        Mary.deposit(100);
        Mary.AddAccount();
    }

}
