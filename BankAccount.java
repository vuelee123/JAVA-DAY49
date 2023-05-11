public class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public void accountInfo() {
        System.out.println("My account balance: $" + balance);
    }
    public void AddAccount () {
        System.out.println("Larry's account balance: $" + balance);
        System.out.println("Mary's account balance: $" + balance);

    }
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
